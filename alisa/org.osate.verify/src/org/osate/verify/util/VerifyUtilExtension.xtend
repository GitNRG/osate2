/**
 * Copyright 2015 Carnegie Mellon University. All Rights Reserved.
 *
 * NO WARRANTY. THIS CARNEGIE MELLON UNIVERSITY AND SOFTWARE ENGINEERING INSTITUTE
 * MATERIAL IS FURNISHED ON AN "AS-IS" BASIS. CARNEGIE MELLON UNIVERSITY MAKES NO
 * WARRANTIES OF ANY KIND, EITHER EXPRESSED OR IMPLIED, AS TO ANY MATTER INCLUDING,
 * BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR PURPOSE OR MERCHANTABILITY,
 * EXCLUSIVITY, OR RESULTS OBTAINED FROM USE OF THE MATERIAL. CARNEGIE MELLON
 * UNIVERSITY DOES NOT MAKE ANY WARRANTY OF ANY KIND WITH RESPECT TO FREEDOM FROM
 * PATENT, TRADEMARK, OR COPYRIGHT INFRINGEMENT.
 *
 * Released under the Eclipse Public License (http://www.eclipse.org/org/documents/epl-v10.php)
 *
 * See COPYRIGHT file for full details.
 */

package org.osate.verify.util

import com.google.common.collect.HashMultimap
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.osate.aadl2.util.Aadl2Util
import org.osate.categories.categories.CategoryFilter
import org.osate.verify.verify.Claim
import org.osate.verify.verify.ElseExpr
import org.osate.verify.verify.VerificationActivity
import org.osate.verify.verify.VerificationMethod
import org.osate.verify.verify.VerificationPlan

import static org.osate.categories.util.CategoriesUtil.*

import static extension org.eclipse.xtext.EcoreUtil2.*

class VerifyUtilExtension {

	static val HashMultimap <String,String> hasRunRecord = HashMultimap.create//Collections.synchronizedMap(newHashMap)

	def static boolean getHasRun(String analysisID, EObject target) {
		val value = hasRunRecord.get(analysisID)
		return value.contains(EcoreUtil.getURI(target).toString)
	}

	def static void setHasRun(String analysisID, EObject target) {
		hasRunRecord.put(analysisID, EcoreUtil.getURI(target).toString)
	}

	def static void unsetHasRun(String analysisID, EObject target) {
		hasRunRecord.remove(analysisID,EcoreUtil.getURI(target).toString)
	}

	def static void clearAllHasRunRecords() {
		hasRunRecord.clear
	}
	
	def static boolean hasFail(ElseExpr cee){
		cee.fail != null 
	}
	
	def static boolean hasTimeout(ElseExpr cee){
		cee.timeout != null 
	}
	
	def static boolean hasError(ElseExpr cee){
		cee.error != null 
	}
	
	
	def static containingVerificationPlan(EObject sh) {
		sh.getContainerOfType(VerificationPlan)
	}
	
	def static getContainingClaim(EObject sh) {
		sh.getContainerOfType(Claim)
		
	}
	
	def static getContainingVerificationMethod(EObject sh) {
		sh.getContainerOfType(VerificationMethod)
	}
	

	def static evaluateRequirementFilter(Claim claim, CategoryFilter filter) {
		if (filter == null) return true
		val req = claim.requirement
		if (Aadl2Util.isNull(req)) return false
		return  intersects(req.qualityCategory,filter.qualityCategory,filter.anyQualityAttribute)
		&& intersects(req.userCategory,filter.userCategory,filter.anyUserSelection)
	}

	def static evaluateVerificationMethodFilter(VerificationActivity va, CategoryFilter filter) {
		if (filter == null) return true
		val vm = va.method
		if (vm == null ) return false
		return  intersects(vm.qualityCategory,filter.qualityCategory,filter.anyQualityAttribute)
		&& intersects(vm.userCategory,filter.userCategory,filter.anyUserSelection)
	}
	
	def static evaluateVerificationActivityFilter(VerificationActivity va, CategoryFilter filter) {
		if (filter == null) return true
		return intersects(va.phaseCategory,filter.phaseCategory,filter.anyDevelopmentPhase) 
		&& intersects(va.userCategory,filter.userCategory,filter.anyUserSelection)
	}
}
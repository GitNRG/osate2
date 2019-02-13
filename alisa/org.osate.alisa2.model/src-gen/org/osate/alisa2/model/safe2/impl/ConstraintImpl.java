/**
 */
package org.osate.alisa2.model.safe2.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osate.alisa2.model.safe2.Constraint;
import org.osate.alisa2.model.safe2.Hazard;
import org.osate.alisa2.model.safe2.Safe2Package;

import org.osate.xtext.aadl2.errormodel.errorModel.ErrorType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.alisa2.model.safe2.impl.ConstraintImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.osate.alisa2.model.safe2.impl.ConstraintImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.osate.alisa2.model.safe2.impl.ConstraintImpl#getExplanations <em>Explanations</em>}</li>
 *   <li>{@link org.osate.alisa2.model.safe2.impl.ConstraintImpl#getErrorType <em>Error Type</em>}</li>
 *   <li>{@link org.osate.alisa2.model.safe2.impl.ConstraintImpl#getHazard <em>Hazard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintImpl extends MinimalEObjectImpl.Container implements Constraint {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExplanations() <em>Explanations</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExplanations()
	 * @generated
	 * @ordered
	 */
	protected EList<String> explanations;

	/**
	 * The cached value of the '{@link #getErrorType() <em>Error Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorType()
	 * @generated
	 * @ordered
	 */
	protected ErrorType errorType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Safe2Package.Literals.CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Safe2Package.CONSTRAINT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Safe2Package.CONSTRAINT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getExplanations() {
		if (explanations == null) {
			explanations = new EDataTypeUniqueEList<String>(String.class, this, Safe2Package.CONSTRAINT__EXPLANATIONS);
		}
		return explanations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorType getErrorType() {
		if (errorType != null && errorType.eIsProxy()) {
			InternalEObject oldErrorType = (InternalEObject)errorType;
			errorType = (ErrorType)eResolveProxy(oldErrorType);
			if (errorType != oldErrorType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Safe2Package.CONSTRAINT__ERROR_TYPE, oldErrorType, errorType));
			}
		}
		return errorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorType basicGetErrorType() {
		return errorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorType(ErrorType newErrorType) {
		ErrorType oldErrorType = errorType;
		errorType = newErrorType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Safe2Package.CONSTRAINT__ERROR_TYPE, oldErrorType, errorType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hazard getHazard() {
		if (eContainerFeatureID() != Safe2Package.CONSTRAINT__HAZARD) return null;
		return (Hazard)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHazard(Hazard newHazard, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newHazard, Safe2Package.CONSTRAINT__HAZARD, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHazard(Hazard newHazard) {
		if (newHazard != eInternalContainer() || (eContainerFeatureID() != Safe2Package.CONSTRAINT__HAZARD && newHazard != null)) {
			if (EcoreUtil.isAncestor(this, newHazard))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHazard != null)
				msgs = ((InternalEObject)newHazard).eInverseAdd(this, Safe2Package.HAZARD__CONSTRAINT, Hazard.class, msgs);
			msgs = basicSetHazard(newHazard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Safe2Package.CONSTRAINT__HAZARD, newHazard, newHazard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Safe2Package.CONSTRAINT__HAZARD:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetHazard((Hazard)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Safe2Package.CONSTRAINT__HAZARD:
				return basicSetHazard(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Safe2Package.CONSTRAINT__HAZARD:
				return eInternalContainer().eInverseRemove(this, Safe2Package.HAZARD__CONSTRAINT, Hazard.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Safe2Package.CONSTRAINT__NAME:
				return getName();
			case Safe2Package.CONSTRAINT__DESCRIPTION:
				return getDescription();
			case Safe2Package.CONSTRAINT__EXPLANATIONS:
				return getExplanations();
			case Safe2Package.CONSTRAINT__ERROR_TYPE:
				if (resolve) return getErrorType();
				return basicGetErrorType();
			case Safe2Package.CONSTRAINT__HAZARD:
				return getHazard();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Safe2Package.CONSTRAINT__NAME:
				setName((String)newValue);
				return;
			case Safe2Package.CONSTRAINT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Safe2Package.CONSTRAINT__EXPLANATIONS:
				getExplanations().clear();
				getExplanations().addAll((Collection<? extends String>)newValue);
				return;
			case Safe2Package.CONSTRAINT__ERROR_TYPE:
				setErrorType((ErrorType)newValue);
				return;
			case Safe2Package.CONSTRAINT__HAZARD:
				setHazard((Hazard)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Safe2Package.CONSTRAINT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Safe2Package.CONSTRAINT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Safe2Package.CONSTRAINT__EXPLANATIONS:
				getExplanations().clear();
				return;
			case Safe2Package.CONSTRAINT__ERROR_TYPE:
				setErrorType((ErrorType)null);
				return;
			case Safe2Package.CONSTRAINT__HAZARD:
				setHazard((Hazard)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Safe2Package.CONSTRAINT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Safe2Package.CONSTRAINT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Safe2Package.CONSTRAINT__EXPLANATIONS:
				return explanations != null && !explanations.isEmpty();
			case Safe2Package.CONSTRAINT__ERROR_TYPE:
				return errorType != null;
			case Safe2Package.CONSTRAINT__HAZARD:
				return getHazard() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", explanations: ");
		result.append(explanations);
		result.append(')');
		return result.toString();
	}

} //ConstraintImpl
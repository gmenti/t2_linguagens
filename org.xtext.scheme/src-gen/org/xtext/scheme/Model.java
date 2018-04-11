/**
 * generated by Xtext 2.12.0
 */
package org.xtext.scheme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.scheme.Model#getFunctions <em>Functions</em>}</li>
 * </ul>
 *
 * @see org.xtext.scheme.SchemePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Functions</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functions</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functions</em>' attribute list.
   * @see org.xtext.scheme.SchemePackage#getModel_Functions()
   * @model unique="false"
   * @generated
   */
  EList<String> getFunctions();

} // Model

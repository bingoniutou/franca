/*******************************************************************************
* Copyright (c) 2015 itemis AG (http://www.itemis.de).
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
package org.franca.deploymodel.dsl.generator.internal

import com.google.inject.Inject
import org.franca.deploymodel.dsl.fDeploy.FDDeclaration
import org.franca.deploymodel.dsl.fDeploy.FDEnumType
import org.franca.deploymodel.dsl.fDeploy.FDPropertyDecl
import org.franca.deploymodel.dsl.fDeploy.FDPropertyHost
import org.franca.deploymodel.dsl.fDeploy.FDSpecification

import static extension org.franca.deploymodel.dsl.generator.internal.GeneratorHelper.*

class IDataGenerator extends AccessMethodGenerator {

	@Inject extension ImportManager
	
	def generate(FDSpecification spec) '''
		/**
		 * Interface for data deployment properties for '�spec.name�' specification
		 * 
		 * This is the data types related part only.
		 */
		public interface IDataPropertyAccessor
			�IF spec.base!=null�extends �spec.base.name�.IDataPropertyAccessor�ENDIF�
		{
			�spec.generateAccessMethods(false)�
			
			�genHelpForGetOverwriteAccessor("FField", "obj")�
			public IDataPropertyAccessor getOverwriteAccessor(FField obj);
		}
	'''

	override genMethod(
		FDPropertyDecl it,
		String francaType,
		boolean isData
	) '''
		public �type.javaType� �methodName�(�francaType� obj);
	'''

	override genEnumMethod(
		FDPropertyDecl it,
		String francaType,
		String enumType,
		String returnType,
		FDEnumType enumerator,
		boolean isData
	) '''
		public enum �enumType� {
			�FOR e : enumerator.enumerators SEPARATOR ", "��e.name��ENDFOR�
		}
		public �returnType� �methodName�(�francaType� obj);
	'''
		
}


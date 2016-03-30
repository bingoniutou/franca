/*******************************************************************************
* This file has been generated by Franca's FDeployGenerator.
* Source: deployment specification 'org.franca.connectors.protobuf.tests.messageWithScalarValueTypeFieldsSpec'
*******************************************************************************/
package org.franca.connectors.protobuf.tests;

import java.util.Map;

import org.franca.core.franca.FArgument;
import org.franca.core.franca.FArrayType;
import org.franca.core.franca.FAttribute;
import org.franca.core.franca.FEnumerator;
import org.franca.core.franca.FField;
import org.franca.core.franca.FModelElement;
import org.franca.deploymodel.core.FDeployedInterface;
import org.franca.deploymodel.core.FDeployedProvider;
import org.franca.deploymodel.core.FDeployedTypeCollection;
import org.franca.deploymodel.core.MappingGenericPropertyAccessor;
import org.franca.deploymodel.dsl.fDeploy.FDCompoundOverwrites;
import org.franca.deploymodel.dsl.fDeploy.FDEnumValue;
import org.franca.deploymodel.dsl.fDeploy.FDEnumerationOverwrites;
import org.franca.deploymodel.dsl.fDeploy.FDField;
import org.franca.deploymodel.dsl.fDeploy.FDOverwriteElement;
import org.franca.deploymodel.dsl.fDeploy.FDTypeOverwrites;

import com.google.common.collect.Maps;

/**
 * This is a collection of all interfaces and classes needed for
 * accessing deployment properties according to deployment specification
 * 'org.franca.connectors.protobuf.tests.messageWithScalarValueTypeFieldsSpec'.
 */
public class MessageWithScalarValueTypeFieldsSpec {

	/**
	 * Enumerations for deployment specification org.franca.connectors.protobuf.tests.messageWithScalarValueTypeFieldsSpec.
	 */
	public interface Enums
		extends org.franca.connectors.protobuf.ProtobufSpec.Enums
	{
	}

	/**
	 * Interface for data deployment properties for 'org.franca.connectors.protobuf.tests.messageWithScalarValueTypeFieldsSpec' specification
	 * 
	 * This is the data types related part only.
	 */
	public interface IDataPropertyAccessor
		extends Enums, org.franca.connectors.protobuf.ProtobufSpec.IDataPropertyAccessor
	{
		
		/**
		 * Get an overwrite-aware accessor for deployment properties.</p>
		 *
		 * This accessor will return overwritten property values in the context 
		 * of a Franca FField object. I.e., the FField obj has a datatype
		 * which can be overwritten in the deployment definition (e.g., Franca array,
		 * struct, union or enumeration). The accessor will return the overwritten values.
		 * If the deployment definition didn't overwrite the value, this accessor will
		 * delegate to its parent accessor.</p>
		 *
		 * @param obj a Franca FField which is the context for the accessor
		 * @return the overwrite-aware accessor
		 */
		public IDataPropertyAccessor getOverwriteAccessor(FField obj);
	
		/**
		 * Get an overwrite-aware accessor for deployment properties.</p>
		 *
		 * This accessor will return overwritten property values in the context 
		 * of a Franca FArrayType object. I.e., the FArrayType obj has a datatype
		 * which can be overwritten in the deployment definition (e.g., Franca array,
		 * struct, union or enumeration). The accessor will return the overwritten values.
		 * If the deployment definition didn't overwrite the value, this accessor will
		 * delegate to its parent accessor.</p>
		 *
		 * @param obj a Franca FArrayType which is the context for the accessor
		 * @return the overwrite-aware accessor
		 */
		public IDataPropertyAccessor getOverwriteAccessor(FArrayType obj);
	}

	/**
	 * Helper class for data-related property accessors.
	 */		
	public static class DataPropertyAccessorHelper implements Enums
	{
		final private MappingGenericPropertyAccessor target;
		final private IDataPropertyAccessor owner;
		
		public DataPropertyAccessorHelper(
			MappingGenericPropertyAccessor target,
			IDataPropertyAccessor owner
		) {
			this.target = target;
			this.owner = owner;
		}
	
		
		protected IDataPropertyAccessor getOverwriteAccessorAux(FModelElement obj) {
			FDOverwriteElement fd = (FDOverwriteElement)target.getFDElement(obj);
			FDTypeOverwrites overwrites = fd.getOverwrites();
			if (overwrites==null)
				return owner;
			else
				return new OverwriteAccessor(overwrites, owner, target);
		}
	}

	/**
	 * Accessor for deployment properties for Franca type collections according
	 * to deployment specification 'org.franca.connectors.protobuf.tests.messageWithScalarValueTypeFieldsSpec'.
	 */		
	public static class TypeCollectionPropertyAccessor
		extends org.franca.connectors.protobuf.ProtobufSpec.TypeCollectionPropertyAccessor
		implements IDataPropertyAccessor
	{
		final private MappingGenericPropertyAccessor target;
		private final DataPropertyAccessorHelper helper;
	
		public TypeCollectionPropertyAccessor(FDeployedTypeCollection target) {
			super(target);
			this.target = target;
			this.helper = new DataPropertyAccessorHelper(target, this);
		}
		
		
		@Override
		public IDataPropertyAccessor getOverwriteAccessor(FField obj) {
			return helper.getOverwriteAccessorAux(obj);
		}
	
		@Override
		public IDataPropertyAccessor getOverwriteAccessor(FArrayType obj) {
			return helper.getOverwriteAccessorAux(obj);
		}
	}

	/**
	 * Accessor for deployment properties for Franca interfaces according to
	 * deployment specification 'org.franca.connectors.protobuf.tests.messageWithScalarValueTypeFieldsSpec'.
	 */
	public static class InterfacePropertyAccessor
		extends org.franca.connectors.protobuf.ProtobufSpec.InterfacePropertyAccessor
		implements IDataPropertyAccessor
	{
		final private MappingGenericPropertyAccessor target;
		private final DataPropertyAccessorHelper helper;
	
		public InterfacePropertyAccessor(FDeployedInterface target) {
			super(target);
			this.target = target;
			this.helper = new DataPropertyAccessorHelper(target, this);
		}
		
		
		/**
		 * Get an overwrite-aware accessor for deployment properties.</p>
		 *
		 * This accessor will return overwritten property values in the context 
		 * of a Franca FAttribute object. I.e., the FAttribute obj has a datatype
		 * which can be overwritten in the deployment definition (e.g., Franca array,
		 * struct, union or enumeration). The accessor will return the overwritten values.
		 * If the deployment definition didn't overwrite the value, this accessor will
		 * delegate to its parent accessor.</p>
		 *
		 * @param obj a Franca FAttribute which is the context for the accessor
		 * @return the overwrite-aware accessor
		 */
		public IDataPropertyAccessor getOverwriteAccessor(FAttribute obj) {
			return helper.getOverwriteAccessorAux(obj);
		}
	
		/**
		 * Get an overwrite-aware accessor for deployment properties.</p>
		 *
		 * This accessor will return overwritten property values in the context 
		 * of a Franca FArgument object. I.e., the FArgument obj has a datatype
		 * which can be overwritten in the deployment definition (e.g., Franca array,
		 * struct, union or enumeration). The accessor will return the overwritten values.
		 * If the deployment definition didn't overwrite the value, this accessor will
		 * delegate to its parent accessor.</p>
		 *
		 * @param obj a Franca FArgument which is the context for the accessor
		 * @return the overwrite-aware accessor
		 */
		public IDataPropertyAccessor getOverwriteAccessor(FArgument obj) {
			return helper.getOverwriteAccessorAux(obj);
		}
	
		@Override
		public IDataPropertyAccessor getOverwriteAccessor(FField obj) {
			return helper.getOverwriteAccessorAux(obj);
		}
	
		@Override
		public IDataPropertyAccessor getOverwriteAccessor(FArrayType obj) {
			return helper.getOverwriteAccessorAux(obj);
		}
	}

	/**
	 * Accessor for deployment properties for providers and interface instances
	 * according to the 'org.franca.connectors.protobuf.tests.messageWithScalarValueTypeFieldsSpec' specification.
	 */
	public static class ProviderPropertyAccessor
		extends org.franca.connectors.protobuf.ProtobufSpec.ProviderPropertyAccessor
		implements Enums
	{
		final private FDeployedProvider target;
	
		public ProviderPropertyAccessor(FDeployedProvider target) {
			super(target);
			this.target = target;
		}
		
	}

	/**
	 * Accessor for getting overwritten property values.
	 */		
	public static class OverwriteAccessor
		extends org.franca.connectors.protobuf.ProtobufSpec.OverwriteAccessor
		implements IDataPropertyAccessor
	{
		private final MappingGenericPropertyAccessor target;
		private final IDataPropertyAccessor delegate;
		
		private final FDTypeOverwrites overwrites;
		private final Map<FField, FDField> mappedFields;
		private final Map<FEnumerator, FDEnumValue> mappedEnumerators;
		private final DataPropertyAccessorHelper helper;
	
		public OverwriteAccessor(
				FDTypeOverwrites overwrites,
				IDataPropertyAccessor delegate,
				MappingGenericPropertyAccessor genericAccessor)
		{
			super(overwrites, delegate, genericAccessor);
			this.target = genericAccessor;
			this.delegate = delegate;
			this.helper = new DataPropertyAccessorHelper(genericAccessor, this);
	
			this.overwrites = overwrites;
			this.mappedFields = Maps.newHashMap();
			this.mappedEnumerators = Maps.newHashMap();
			if (overwrites!=null) {
				if (overwrites instanceof FDCompoundOverwrites) {
					// build mapping for compound fields
					for(FDField f : ((FDCompoundOverwrites)overwrites).getFields()) {
						this.mappedFields.put(f.getTarget(), f);
					}
				}
				if (overwrites instanceof FDEnumerationOverwrites) {
					// build mapping for enumerators
					for(FDEnumValue e : ((FDEnumerationOverwrites)overwrites).getEnumerators()) {
						this.mappedEnumerators.put(e.getTarget(), e);
					}
				}
			}
		}
		
		
		@Override
		public IDataPropertyAccessor getOverwriteAccessor(FField obj) {
			// check if this field is overwritten
			if (mappedFields.containsKey(obj)) {
				FDField fo = mappedFields.get(obj);
				FDTypeOverwrites overwrites = fo.getOverwrites();
				if (overwrites==null)
					return this; // TODO: correct?
				else
					// TODO: this or delegate?
					return new OverwriteAccessor(overwrites, this, target);
				
			}
			return delegate.getOverwriteAccessor(obj);
		}
	
		@Override
		public IDataPropertyAccessor getOverwriteAccessor(FArrayType obj) {
			// check if this array is overwritten
			if (overwrites!=null) {
				// TODO: this or delegate?
				return new OverwriteAccessor(overwrites, this, target);
			}
			return delegate.getOverwriteAccessor(obj);
		}
	}
}
	
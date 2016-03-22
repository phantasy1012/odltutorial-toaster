package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.impl.rev160321;

import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.opendaylight.controller.sal.binding.api.BindingAwareBroker.ProviderContext;
import org.opendaylight.toaster.impl.ToasterProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ToasterModule extends org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.impl.rev160321.AbstractToasterModule {
    
	private static final Logger LOG = LoggerFactory.getLogger(ToasterModule.class);
	
	public ToasterModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        super(identifier, dependencyResolver);
    }

    public ToasterModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.impl.rev160321.ToasterModule oldModule, java.lang.AutoCloseable oldInstance) {
        super(identifier, dependencyResolver, oldModule, oldInstance);
    }

    @Override
    public void customValidation() {
        // add custom validation form module attributes here.
    }

    @Override
    public java.lang.AutoCloseable createInstance() {
    	LOG.info("Creating a new Toaster instance");
    	final ToasterProvider provider = new ToasterProvider();
    	
    	provider.setNotificationProvider(getNotificationServiceDependency());
    	
    	getBrokerDependency().registerProvider(provider);
    	
    	// Register runtimeBean for toaster statistics via JMX
        final ToasterRuntimeRegistration runtimeReg = getRootRuntimeBeanRegistratorWrapper().register( provider);
        
    	return runtimeReg;
    }

}

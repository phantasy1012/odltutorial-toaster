/*
* Generated file
*
* Generated from: yang module name: toaster-impl yang module local name: toaster
* Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
* Generated at: Mon Mar 21 18:48:27 CST 2016
*
* Do not modify this file unless it is present under src/main directory
*/
package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.impl.rev160321;
@org.opendaylight.yangtools.yang.binding.annotations.ModuleQName(revision = "2016-03-21", name = "toaster-impl", namespace = "urn:opendaylight:params:xml:ns:yang:toaster:impl")

public abstract class AbstractToasterModule extends org.opendaylight.controller.config.spi.AbstractModule<AbstractToasterModule> implements org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.impl.rev160321.ToasterModuleMXBean {
    private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.impl.rev160321.AbstractToasterModule.class);

    //attributes start

    public static final org.opendaylight.controller.config.api.JmxAttribute brokerJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("Broker");
    private javax.management.ObjectName broker; // mandatory

    //attributes end

    public AbstractToasterModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier,org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        super(identifier, dependencyResolver);
    }

    public AbstractToasterModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier,org.opendaylight.controller.config.api.DependencyResolver dependencyResolver,AbstractToasterModule oldModule,java.lang.AutoCloseable oldInstance) {
        super(identifier, dependencyResolver, oldModule, oldInstance);
    }

    @Override
    public void validate() {
        dependencyResolver.validateDependency(org.opendaylight.controller.config.yang.md.sal.binding.BindingAwareBrokerServiceInterface.class, broker, brokerJmxAttribute);

        customValidation();
    }

    protected void customValidation() {
    }

    private org.opendaylight.controller.sal.binding.api.BindingAwareBroker brokerDependency;
    protected final org.opendaylight.controller.sal.binding.api.BindingAwareBroker getBrokerDependency(){
        return brokerDependency;
    }

    protected final void resolveDependencies() {
        brokerDependency = dependencyResolver.resolveInstance(org.opendaylight.controller.sal.binding.api.BindingAwareBroker.class, broker, brokerJmxAttribute);
    }

    public boolean canReuseInstance(AbstractToasterModule oldModule){
        // allow reusing of old instance if no parameters was changed
        return isSame(oldModule);
    }

    public java.lang.AutoCloseable reuseInstance(java.lang.AutoCloseable oldInstance){
        // implement if instance reuse should be supported. Override canReuseInstance to change the criteria.
        return oldInstance;
    }

    public boolean isSame(AbstractToasterModule other) {
        if (other == null) {
            throw new IllegalArgumentException("Parameter 'other' is null");
        }
        if (!java.util.Objects.deepEquals(broker, other.broker)) {
            return false;
        }
        if(broker!= null) {
            if (!dependencyResolver.canReuseDependency(broker, brokerJmxAttribute)) { // reference to dependency must be reusable as well
                return false;
            }
        }

        return true;
    }

    @Override
    public boolean equals(Object o) {
    if (this == o) { return true; }
    if (o == null || getClass() != o.getClass()) { return false; }
        AbstractToasterModule that = (AbstractToasterModule) o;
        return identifier.equals(that.identifier);
    }

    @Override
    public int hashCode() {
        return identifier.hashCode();
    }

    // getters and setters
    @Override
    public javax.management.ObjectName getBroker() {
        return broker;
    }

    @Override
    @org.opendaylight.controller.config.api.annotations.RequireInterface(value = org.opendaylight.controller.config.yang.md.sal.binding.BindingAwareBrokerServiceInterface.class)
    public void setBroker(javax.management.ObjectName broker) {
        this.broker = broker;
    }

    public org.slf4j.Logger getLogger() {
        return LOGGER;
    }

}

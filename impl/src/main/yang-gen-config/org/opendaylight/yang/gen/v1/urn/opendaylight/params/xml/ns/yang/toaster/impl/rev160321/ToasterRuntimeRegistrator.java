package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.impl.rev160321;
public class ToasterRuntimeRegistrator implements java.io.Closeable {
    private final org.opendaylight.controller.config.api.runtime.RootRuntimeBeanRegistrator rootRuntimeBeanRegistrator;

    public  ToasterRuntimeRegistrator(final org.opendaylight.controller.config.api.runtime.RootRuntimeBeanRegistrator rootRuntimeBeanRegistrator) {
        this.rootRuntimeBeanRegistrator=rootRuntimeBeanRegistrator;

    }

    public org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.impl.rev160321.ToasterRuntimeRegistration register(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.impl.rev160321.ToasterRuntimeMXBean rb) {
        org.opendaylight.controller.config.api.runtime.HierarchicalRuntimeBeanRegistration registration = this.rootRuntimeBeanRegistrator.registerRoot(rb);
        return new org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.impl.rev160321.ToasterRuntimeRegistration(registration);

    }

    @Override
    public void close() {
        rootRuntimeBeanRegistrator.close();
    }

}

package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.toaster.impl.rev160321;
public class ToasterRuntimeRegistration implements java.io.Closeable {
    private final java.util.Map<java.lang.String,java.util.concurrent.atomic.AtomicInteger> unkeyedMap = new java.util.HashMap<java.lang.String,java.util.concurrent.atomic.AtomicInteger>();

    private final org.opendaylight.controller.config.api.runtime.HierarchicalRuntimeBeanRegistration registration;

    @Override
    public void close() {
        registration.close();
    }

    public  ToasterRuntimeRegistration(final org.opendaylight.controller.config.api.runtime.HierarchicalRuntimeBeanRegistration registration) {
        this.registration=registration;

    }

}

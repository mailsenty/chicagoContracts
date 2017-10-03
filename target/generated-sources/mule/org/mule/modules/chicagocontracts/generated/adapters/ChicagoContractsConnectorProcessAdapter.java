
package org.mule.modules.chicagocontracts.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.chicagocontracts.ChicagoContractsConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>ChicagoContractsConnectorProcessAdapter</code> is a wrapper around {@link ChicagoContractsConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-10-03T12:46:54-04:00", comments = "Build UNNAMED.2793.f49b6c7")
public class ChicagoContractsConnectorProcessAdapter
    extends ChicagoContractsConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<ChicagoContractsConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, ChicagoContractsConnectorCapabilitiesAdapter> getProcessTemplate() {
        final ChicagoContractsConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,ChicagoContractsConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, ChicagoContractsConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, ChicagoContractsConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}

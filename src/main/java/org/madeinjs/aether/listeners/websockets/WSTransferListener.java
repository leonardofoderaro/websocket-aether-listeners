package org.madeinjs.aether.listeners.websockets;

import org.eclipse.aether.transfer.AbstractTransferListener;
import org.eclipse.aether.transfer.TransferCancelledException;
import org.eclipse.aether.transfer.TransferEvent;
import org.eclipse.jetty.websocket.api.RemoteEndpoint;

public class WSTransferListener extends AbstractTransferListener {
	
	private RemoteEndpoint endpoint;

    public WSTransferListener(RemoteEndpoint endpoint)   {
    	this.endpoint = endpoint;
    }

    public void transferInitiated( TransferEvent event )
        throws TransferCancelledException
    {
    	System.out.println("OOOOOOOOK");
    	endpoint.sendStringByFuture("Transfer Initiated");
    }

    public void transferStarted( TransferEvent event )
        throws TransferCancelledException
    {
    	System.out.println("aaaa");
    	endpoint.sendStringByFuture("Transfer Started");
    }

    public void transferProgressed( TransferEvent event )
        throws TransferCancelledException

    {
    	System.out.println("bbbb");
    	endpoint.sendStringByFuture(".");
    }

    public void transferCorrupted( TransferEvent event )
        throws TransferCancelledException
    {
    	endpoint.sendStringByFuture("CORRUPTED");
    }

    public void transferSucceeded( TransferEvent event )
    {
    	endpoint.sendStringByFuture("SUCESS");
    }

    public void transferFailed( TransferEvent event )
    {
    	endpoint.sendStringByFuture("FAILED");
    }
}

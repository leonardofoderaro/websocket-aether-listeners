package org.madeinjs.aether.listeners.websockets;

import org.eclipse.aether.AbstractRepositoryListener;
import org.eclipse.aether.RepositoryEvent;
import org.eclipse.jetty.websocket.api.RemoteEndpoint;

public class WSRepositoryListener extends AbstractRepositoryListener {
	

    private RemoteEndpoint endpoint;

	/**
     * Enables subclassing.
     */
    public WSRepositoryListener(RemoteEndpoint endpoint) {
    	 this.endpoint = endpoint;
    }

    public void artifactDeployed( RepositoryEvent event ) {
    	 endpoint.sendStringByFuture("deployed!");
    }

    public void artifactDeploying( RepositoryEvent event )
    {
    	 endpoint.sendStringByFuture("deploying!");
    }

    public void artifactDescriptorInvalid( RepositoryEvent event )
    {
    	 endpoint.sendStringByFuture("invalid!");
    }

    public void artifactDescriptorMissing( RepositoryEvent event )
    {
    	 endpoint.sendStringByFuture("missing!");
    }

    public void artifactDownloaded( RepositoryEvent event )
    {
    	 endpoint.sendStringByFuture("downloaded!");
    }

    public void artifactDownloading( RepositoryEvent event )
    {
    	 endpoint.sendStringByFuture("downloading!");
    }

    public void artifactInstalled( RepositoryEvent event )
    {
    	 endpoint.sendStringByFuture("installed!");
    }

    public void artifactInstalling( RepositoryEvent event )
    {
    	 endpoint.sendStringByFuture("installing!");
    }

    public void artifactResolved( RepositoryEvent event )
    {
    	 endpoint.sendStringByFuture("resolved to " + event.getFile().toString());
    }

    public void artifactResolving( RepositoryEvent event )
    {
    	 endpoint.sendStringByFuture("resolving " + event.getArtifact().toString());
    }

    public void metadataDeployed( RepositoryEvent event )
    {
    	 endpoint.sendStringByFuture("metadata deployed!");
    }

    public void metadataDeploying( RepositoryEvent event )
    {
    	 endpoint.sendStringByFuture("metadata deploying!");
    }

    public void metadataDownloaded( RepositoryEvent event )
    {
    	 endpoint.sendStringByFuture("metadata downloaded!");
    }

    public void metadataDownloading( RepositoryEvent event )
    {
    	 endpoint.sendStringByFuture("metadata downloading!");
    }

    public void metadataInstalled( RepositoryEvent event )
    {
    	 endpoint.sendStringByFuture("metadata installed!");
    }

    public void metadataInstalling( RepositoryEvent event )
    {
    	 endpoint.sendStringByFuture("metadata installing!");
    }

    public void metadataInvalid( RepositoryEvent event )
    {
    	 endpoint.sendStringByFuture("metadata invalid!");
    }

    public void metadataResolved( RepositoryEvent event )
    {
    	 endpoint.sendStringByFuture("metadata resolved!");
    }

    public void metadataResolving( RepositoryEvent event )
    {
    	 endpoint.sendStringByFuture("metadata resolving!");
    }

}

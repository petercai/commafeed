package com.commafeed.frontend.resource;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.codahale.metrics.annotation.Timed;
import com.commafeed.frontend.model.HealthInfo;

import lombok.RequiredArgsConstructor;

@Path("/health")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@RequiredArgsConstructor(onConstructor = @__({ @Inject }) )
@Singleton
public class HealthREST {

	@Path("/health")
	@GET
	@Timed
	public Response get() {
		HealthInfo infos = new HealthInfo();
		infos.setStatus("UP");
		return Response.ok(infos).build();
	}
}

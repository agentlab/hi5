/*******************************************************************************
 * Copyright (c) 2016 Erdal Karaca.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Erdal Karaca <erdal.karaca.de@gmail.com> - initial API and implementation
 *******************************************************************************/
package de.metadocks.hi5.jaxrs.emf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.texo.json.EMFJSONConverter;
import org.json.JSONException;
import org.json.JSONObject;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

@Component(service = MessageBodyWriter.class, immediate = true)
@Provider
@Produces(MediaType.APPLICATION_JSON)
public class EMFMessageBodyWriter implements MessageBodyWriter<EObject> {
	private EMFJSONConverter converter = new EMFJSONConverter();

	@Activate
	public void activate() {
        //converter.setConvertReferences(true);
        //converter.setResolveProxies(true);
	}

	@Override
	public long getSize(EObject arg0, Class<?> arg1, Type arg2, Annotation[] arg3, MediaType arg4) {
		return -1;
	}

	@Override
	public boolean isWriteable(Class<?> arg0, Type arg1, Annotation[] arg2, MediaType arg3) {
		return EObject.class.isAssignableFrom(arg0) && MediaType.APPLICATION_JSON_TYPE.equals(arg3);
	}

	@Override
	public void writeTo(EObject arg0, Class<?> arg1, Type arg2, Annotation[] arg3, MediaType arg4,
			MultivaluedMap<String, Object> arg5, OutputStream arg6) throws IOException, WebApplicationException {
		JSONObject jObj = (JSONObject) converter.convert(arg0);

		try {
			OutputStreamWriter writer = new OutputStreamWriter(arg6);
			jObj.write(writer);
			writer.flush();
		} catch (JSONException e) {
			throw new IOException(e);
		}
	}
}

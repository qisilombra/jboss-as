/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2011, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jboss.as.domain.http.server;

import org.jboss.logging.annotations.Cause;
import org.jboss.logging.annotations.Message;
import org.jboss.logging.annotations.MessageBundle;
import org.jboss.logging.Messages;
import org.jboss.modules.ModuleNotFoundException;

/**
 * Date: 05.11.2011
 *
 * @author <a href="mailto:jperkins@redhat.com">James R. Perkins</a>
 */
@MessageBundle(projectCode = "JBAS")
public interface HttpServerMessages {

    /**
     * The messages.
     */
    HttpServerMessages MESSAGES = Messages.getBundle(HttpServerMessages.class);

    /**
     * Creates an exception indicating the callback was rejected by the handler.
     *
     * @param cause the cause of the error.
     *
     * @return an {@link IllegalStateException} for the error.
     */
    @Message(id = 15120, value = "Callback rejected by handler.")
    IllegalStateException callbackRejected(@Cause Throwable cause);

    /**
     * Creates an exception indicating a failure to read the resource.
     *
     * @param cause    the cause of the error.
     * @param resource the resource.
     *
     * @return a {@link RuntimeException} for the error.
     */
    @Message(id = 15121, value = "Failed to read %s")
    RuntimeException failedReadingResource(@Cause Throwable cause, String resource);

    /**
     * Creates an exception indicating the authorization header is invalid.
     *
     * @return a {@link RuntimeException} for the error.
     */
    @Message(id = 15122, value = "Invalid 'Authorization' header.")
    RuntimeException invalidAuthorizationHeader();

    /**
     * Creates an exception indicating the callback handler is not suitable for Digest authentication.
     *
     * @return an {@link IllegalStateException} for the error.
     */
    @Message(id = 15123, value = "CallbackHandler not suitable for Digest authentication.")
    IllegalStateException invalidCallbackHandler();

    /**
     * Creates an exception indicating no content type was provided.
     *
     * @return an {@link IllegalArgumentException} for the error.
     */
    @Message(id = 15124, value = "No content type provided")
    IllegalArgumentException invalidContentType();

    /**
     * Creates an exception indicating an invalid content type was provided.
     *
     * @param type the invalid type.
     *
     * @return an {@link IllegalArgumentException} for the error.
     */
    @Message(id = 15125, value = "Invalid content type provided: %s")
    IllegalArgumentException invalidContentType(String type);

    /**
     * Creates an exception indicating the request did not contain a deployment.
     *
     * @return an {@link IllegalArgumentException} for the error.
     */
    @Message(id = 15126, value = "Request did not contain a deployment")
    IllegalArgumentException invalidDeployment();

    /**
     * Creates an exception indicating the operation, represented by the {@code value} parameter, is invalid.
     *
     * @param cause the cause of the error.
     * @param value the invalid operation.
     *
     * @return an {@link IllegalArgumentException} for the error.
     */
    @Message(id = 15127, value = "Invalid operation '%s'")
    IllegalArgumentException invalidOperation(@Cause Throwable cause, String value);

    /**
     * A message indicating the resource is invalid.
     *
     * @return the message.
     */
    @Message(id = 15128, value = "Invalid resource")
    String invalidResource();

    /**
     * Creates an exception indicating the inability to perform digest validation as MD5 is unavailable.
     *
     * @param cause the cause of the error.
     *
     * @return an {@link IllegalStateException} for the error.
     */
    @Message(id = 15129, value = "Unable to perform digest validation as MD5 is unavailable.")
    IllegalStateException md5Unavailable(@Cause Throwable cause);

    /**
     * Creates an exception indicating a closing quote could not be found for the header entry, represented by the
     * {@code key} parameter.
     *
     * @param key the header key.
     *
     * @return an  {@link IllegalArgumentException} for the error.
     */
    @Message(id = 15130, value = "Unable to find closing quote for %s")
    IllegalArgumentException missingClosingQuote(String key);

    /**
     * Creates an exception indicating that unexpected characters are being drop from the header.
     *
     * @param dropping the characters being dropped.
     * @param key      the header key.
     *
     * @return an {@link IllegalArgumentException} for the error.
     */
    @Message(id = 15131, value = "Unexpected characters being dropped from header '%s' for %s")
    IllegalArgumentException unexpectedHeaderChar(String dropping, String key);

    /**
     * The description for the {@link RedirectReadinessFilter}.
     *
     * @return the description.
     */
    @Message(id = 15133, value = "Redirect request to instructional page if the realm is not ready.")
    String redirectReadinessFilter();

    /**
     * The description for the {@link DmrFailureReadinessFilter}.
     *
     * @return the description.
     */
    @Message(id = 15134, value = "Returns a DMR failure if the security realm is not ready to handle authentication requests.")
    String dmrFailureReadinessFilter();

    /**
     * An error message indicating that the security realm is not ready to process requests and a URL that can be viewed for
     * additional information.
     *
     * @param url - the url clients should visit for further information.
     * @return the error message.
     */
    @Message(id = 15135, value = "The security realm is not ready to process requests, see %s")
    String realmNotReadyMessage(final String url);


    @Message(id = 15136, value = "No console module available with module name %s")
    ModuleNotFoundException consoleModuleNotFound(final String moduleName);

    /*
     * Message IDs 15100 to 15199 Reserved for the HTTP management interface, HttpServerLogger also contains messages in this
     * range commencing at 15100.
     */
}

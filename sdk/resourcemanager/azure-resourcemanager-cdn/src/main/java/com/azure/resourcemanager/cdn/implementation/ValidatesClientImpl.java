// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cdn.fluent.ValidatesClient;
import com.azure.resourcemanager.cdn.fluent.models.ValidateSecretOutputInner;
import com.azure.resourcemanager.cdn.models.ValidateSecretInput;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ValidatesClient. */
public final class ValidatesClientImpl implements ValidatesClient {
    private final ClientLogger logger = new ClientLogger(ValidatesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final ValidatesService service;

    /** The service client containing this operation class. */
    private final CdnManagementClientImpl client;

    /**
     * Initializes an instance of ValidatesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ValidatesClientImpl(CdnManagementClientImpl client) {
        this.service =
            RestProxy.create(ValidatesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for CdnManagementClientValidates to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "CdnManagementClientV")
    private interface ValidatesService {
        @Headers({"Content-Type: application/json"})
        @Post("/subscriptions/{subscriptionId}/providers/Microsoft.Cdn/validateSecret")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ValidateSecretOutputInner>> secret(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") ValidateSecretInput validateSecretInput,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Validate a Secret in the profile.
     *
     * @param validateSecretInput The Secret source.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of the validated secret along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ValidateSecretOutputInner>> secretWithResponseAsync(ValidateSecretInput validateSecretInput) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (validateSecretInput == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter validateSecretInput is required and cannot be null."));
        } else {
            validateSecretInput.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .secret(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            validateSecretInput,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Validate a Secret in the profile.
     *
     * @param validateSecretInput The Secret source.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of the validated secret along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ValidateSecretOutputInner>> secretWithResponseAsync(
        ValidateSecretInput validateSecretInput, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (validateSecretInput == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter validateSecretInput is required and cannot be null."));
        } else {
            validateSecretInput.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .secret(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                this.client.getApiVersion(),
                validateSecretInput,
                accept,
                context);
    }

    /**
     * Validate a Secret in the profile.
     *
     * @param validateSecretInput The Secret source.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of the validated secret on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ValidateSecretOutputInner> secretAsync(ValidateSecretInput validateSecretInput) {
        return secretWithResponseAsync(validateSecretInput)
            .flatMap(
                (Response<ValidateSecretOutputInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Validate a Secret in the profile.
     *
     * @param validateSecretInput The Secret source.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of the validated secret.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ValidateSecretOutputInner secret(ValidateSecretInput validateSecretInput) {
        return secretAsync(validateSecretInput).block();
    }

    /**
     * Validate a Secret in the profile.
     *
     * @param validateSecretInput The Secret source.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of the validated secret along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ValidateSecretOutputInner> secretWithResponse(
        ValidateSecretInput validateSecretInput, Context context) {
        return secretWithResponseAsync(validateSecretInput, context).block();
    }
}

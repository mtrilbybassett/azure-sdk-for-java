// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.fluent.models.ExpressRoutePortAuthorizationInner;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ExpressRoutePortAuthorizationsClient. */
public interface ExpressRoutePortAuthorizationsClient {
    /**
     * Deletes the specified authorization from the specified express route port.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the express route port.
     * @param authorizationName The name of the authorization.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(
        String resourceGroupName, String expressRoutePortName, String authorizationName);

    /**
     * Deletes the specified authorization from the specified express route port.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the express route port.
     * @param authorizationName The name of the authorization.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(
        String resourceGroupName, String expressRoutePortName, String authorizationName);

    /**
     * Deletes the specified authorization from the specified express route port.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the express route port.
     * @param authorizationName The name of the authorization.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String expressRoutePortName, String authorizationName);

    /**
     * Deletes the specified authorization from the specified express route port.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the express route port.
     * @param authorizationName The name of the authorization.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String expressRoutePortName, String authorizationName, Context context);

    /**
     * Deletes the specified authorization from the specified express route port.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the express route port.
     * @param authorizationName The name of the authorization.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String expressRoutePortName, String authorizationName);

    /**
     * Deletes the specified authorization from the specified express route port.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the express route port.
     * @param authorizationName The name of the authorization.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String expressRoutePortName, String authorizationName);

    /**
     * Deletes the specified authorization from the specified express route port.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the express route port.
     * @param authorizationName The name of the authorization.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String expressRoutePortName, String authorizationName, Context context);

    /**
     * Gets the specified authorization from the specified express route port.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the express route port.
     * @param authorizationName The name of the authorization.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified authorization from the specified express route port along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ExpressRoutePortAuthorizationInner>> getWithResponseAsync(
        String resourceGroupName, String expressRoutePortName, String authorizationName);

    /**
     * Gets the specified authorization from the specified express route port.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the express route port.
     * @param authorizationName The name of the authorization.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified authorization from the specified express route port on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ExpressRoutePortAuthorizationInner> getAsync(
        String resourceGroupName, String expressRoutePortName, String authorizationName);

    /**
     * Gets the specified authorization from the specified express route port.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the express route port.
     * @param authorizationName The name of the authorization.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified authorization from the specified express route port.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRoutePortAuthorizationInner get(
        String resourceGroupName, String expressRoutePortName, String authorizationName);

    /**
     * Gets the specified authorization from the specified express route port.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the express route port.
     * @param authorizationName The name of the authorization.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified authorization from the specified express route port along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExpressRoutePortAuthorizationInner> getWithResponse(
        String resourceGroupName, String expressRoutePortName, String authorizationName, Context context);

    /**
     * Creates or updates an authorization in the specified express route port.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the express route port.
     * @param authorizationName The name of the authorization.
     * @param authorizationParameters Parameters supplied to the create or update express route port authorization
     *     operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoute Port Authorization along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String expressRoutePortName,
        String authorizationName,
        ExpressRoutePortAuthorizationInner authorizationParameters);

    /**
     * Creates or updates an authorization in the specified express route port.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the express route port.
     * @param authorizationName The name of the authorization.
     * @param authorizationParameters Parameters supplied to the create or update express route port authorization
     *     operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of expressRoute Port Authorization.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<ExpressRoutePortAuthorizationInner>, ExpressRoutePortAuthorizationInner>
        beginCreateOrUpdateAsync(
            String resourceGroupName,
            String expressRoutePortName,
            String authorizationName,
            ExpressRoutePortAuthorizationInner authorizationParameters);

    /**
     * Creates or updates an authorization in the specified express route port.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the express route port.
     * @param authorizationName The name of the authorization.
     * @param authorizationParameters Parameters supplied to the create or update express route port authorization
     *     operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of expressRoute Port Authorization.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ExpressRoutePortAuthorizationInner>, ExpressRoutePortAuthorizationInner> beginCreateOrUpdate(
        String resourceGroupName,
        String expressRoutePortName,
        String authorizationName,
        ExpressRoutePortAuthorizationInner authorizationParameters);

    /**
     * Creates or updates an authorization in the specified express route port.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the express route port.
     * @param authorizationName The name of the authorization.
     * @param authorizationParameters Parameters supplied to the create or update express route port authorization
     *     operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of expressRoute Port Authorization.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ExpressRoutePortAuthorizationInner>, ExpressRoutePortAuthorizationInner> beginCreateOrUpdate(
        String resourceGroupName,
        String expressRoutePortName,
        String authorizationName,
        ExpressRoutePortAuthorizationInner authorizationParameters,
        Context context);

    /**
     * Creates or updates an authorization in the specified express route port.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the express route port.
     * @param authorizationName The name of the authorization.
     * @param authorizationParameters Parameters supplied to the create or update express route port authorization
     *     operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoute Port Authorization on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ExpressRoutePortAuthorizationInner> createOrUpdateAsync(
        String resourceGroupName,
        String expressRoutePortName,
        String authorizationName,
        ExpressRoutePortAuthorizationInner authorizationParameters);

    /**
     * Creates or updates an authorization in the specified express route port.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the express route port.
     * @param authorizationName The name of the authorization.
     * @param authorizationParameters Parameters supplied to the create or update express route port authorization
     *     operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoute Port Authorization.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRoutePortAuthorizationInner createOrUpdate(
        String resourceGroupName,
        String expressRoutePortName,
        String authorizationName,
        ExpressRoutePortAuthorizationInner authorizationParameters);

    /**
     * Creates or updates an authorization in the specified express route port.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the express route port.
     * @param authorizationName The name of the authorization.
     * @param authorizationParameters Parameters supplied to the create or update express route port authorization
     *     operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoute Port Authorization.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRoutePortAuthorizationInner createOrUpdate(
        String resourceGroupName,
        String expressRoutePortName,
        String authorizationName,
        ExpressRoutePortAuthorizationInner authorizationParameters,
        Context context);

    /**
     * Gets all authorizations in an express route port.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the express route port.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all authorizations in an express route port as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ExpressRoutePortAuthorizationInner> listAsync(String resourceGroupName, String expressRoutePortName);

    /**
     * Gets all authorizations in an express route port.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the express route port.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all authorizations in an express route port as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExpressRoutePortAuthorizationInner> list(String resourceGroupName, String expressRoutePortName);

    /**
     * Gets all authorizations in an express route port.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRoutePortName The name of the express route port.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all authorizations in an express route port as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExpressRoutePortAuthorizationInner> list(
        String resourceGroupName, String expressRoutePortName, Context context);
}

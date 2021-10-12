// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.administration;

import com.azure.analytics.purview.administration.implementation.CollectionsImpl;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;

/** Initializes a new instance of the synchronous PurviewAccountClient type. */
@ServiceClient(builder = PurviewAccountClientBuilder.class)
public final class CollectionsClient {
    private final CollectionsImpl serviceClient;

    /**
     * Initializes an instance of Collections client.
     *
     * @param serviceClient the service client implementation.
     */
    CollectionsClient(CollectionsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Get a collection.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     collectionProvisioningState: String(Unknown/Creating/Moving/Deleting/Failed/Succeeded)
     *     description: String
     *     friendlyName: String
     *     name: String
     *     parentCollection: {
     *         referenceName: String
     *         type: String
     *     }
     *     systemData: {
     *         createdAt: String
     *         createdBy: String
     *         createdByType: String(User/Application/ManagedIdentity/Key)
     *         lastModifiedAt: String
     *         lastModifiedBy: String
     *         lastModifiedByType: String(User/Application/ManagedIdentity/Key)
     *     }
     * }
     * }</pre>
     *
     * @param collectionName The collectionName parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a collection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getCollectionWithResponse(
            String collectionName, RequestOptions requestOptions, Context context) {
        return this.serviceClient.getCollectionWithResponse(collectionName, requestOptions, context);
    }

    /**
     * Creates or updates a collection entity.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     collectionProvisioningState: String(Unknown/Creating/Moving/Deleting/Failed/Succeeded)
     *     description: String
     *     friendlyName: String
     *     name: String
     *     parentCollection: {
     *         referenceName: String
     *         type: String
     *     }
     *     systemData: {
     *         createdAt: String
     *         createdBy: String
     *         createdByType: String(User/Application/ManagedIdentity/Key)
     *         lastModifiedAt: String
     *         lastModifiedBy: String
     *         lastModifiedByType: String(User/Application/ManagedIdentity/Key)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     collectionProvisioningState: String(Unknown/Creating/Moving/Deleting/Failed/Succeeded)
     *     description: String
     *     friendlyName: String
     *     name: String
     *     parentCollection: {
     *         referenceName: String
     *         type: String
     *     }
     *     systemData: {
     *         createdAt: String
     *         createdBy: String
     *         createdByType: String(User/Application/ManagedIdentity/Key)
     *         lastModifiedAt: String
     *         lastModifiedBy: String
     *         lastModifiedByType: String(User/Application/ManagedIdentity/Key)
     *     }
     * }
     * }</pre>
     *
     * @param collectionName The collectionName parameter.
     * @param collection Collection resource.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return collection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> createOrUpdateCollectionWithResponse(
            String collectionName, BinaryData collection, RequestOptions requestOptions, Context context) {
        return this.serviceClient.createOrUpdateCollectionWithResponse(
                collectionName, collection, requestOptions, context);
    }

    /**
     * Deletes a Collection entity.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * @param collectionName The collectionName parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteCollectionWithResponse(
            String collectionName, RequestOptions requestOptions, Context context) {
        return this.serviceClient.deleteCollectionWithResponse(collectionName, requestOptions, context);
    }

    /**
     * List the collections in the account.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     *     <tr><td>skipToken</td><td>String</td><td>No</td><td>The skipToken parameter</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     count: Long
     *     nextLink: String
     *     value: [
     *         {
     *             collectionProvisioningState: String(Unknown/Creating/Moving/Deleting/Failed/Succeeded)
     *             description: String
     *             friendlyName: String
     *             name: String
     *             parentCollection: {
     *                 referenceName: String
     *                 type: String
     *             }
     *             systemData: {
     *                 createdAt: String
     *                 createdBy: String
     *                 createdByType: String(User/Application/ManagedIdentity/Key)
     *                 lastModifiedAt: String
     *                 lastModifiedBy: String
     *                 lastModifiedByType: String(User/Application/ManagedIdentity/Key)
     *             }
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return paged list of collections.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listCollections(RequestOptions requestOptions, Context context) {
        return this.serviceClient.listCollections(requestOptions, context);
    }

    /**
     * Lists the child collections names in the collection.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     *     <tr><td>skipToken</td><td>String</td><td>No</td><td>The skipToken parameter</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     count: Long
     *     nextLink: String
     *     value: [
     *         {
     *             friendlyName: String
     *             name: String
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param collectionName The collectionName parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return paged list of collections.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listChildCollectionNames(
            String collectionName, RequestOptions requestOptions, Context context) {
        return this.serviceClient.listChildCollectionNames(collectionName, requestOptions, context);
    }

    /**
     * Gets the parent name and parent friendly name chains that represent the collection path.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     parentFriendlyNameChain: [
     *         String
     *     ]
     *     parentNameChain: [
     *         String
     *     ]
     * }
     * }</pre>
     *
     * @param collectionName The collectionName parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the parent name and parent friendly name chains that represent the collection path.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getCollectionPathWithResponse(
            String collectionName, RequestOptions requestOptions, Context context) {
        return this.serviceClient.getCollectionPathWithResponse(collectionName, requestOptions, context);
    }
}
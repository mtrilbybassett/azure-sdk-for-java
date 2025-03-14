// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.RestServiceLinkedServiceTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Rest Service linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("RestService")
@Fluent
public final class RestServiceLinkedService extends LinkedService {
    /*
     * Rest Service linked service properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private RestServiceLinkedServiceTypeProperties innerTypeProperties = new RestServiceLinkedServiceTypeProperties();

    /**
     * Get the innerTypeProperties property: Rest Service linked service properties.
     *
     * @return the innerTypeProperties value.
     */
    private RestServiceLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public RestServiceLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RestServiceLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RestServiceLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RestServiceLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the url property: The base URL of the REST service.
     *
     * @return the url value.
     */
    public Object url() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().url();
    }

    /**
     * Set the url property: The base URL of the REST service.
     *
     * @param url the url value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService withUrl(Object url) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new RestServiceLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUrl(url);
        return this;
    }

    /**
     * Get the enableServerCertificateValidation property: Whether to validate server side SSL certificate when
     * connecting to the endpoint.The default value is true. Type: boolean (or Expression with resultType boolean).
     *
     * @return the enableServerCertificateValidation value.
     */
    public Object enableServerCertificateValidation() {
        return this.innerTypeProperties() == null
            ? null
            : this.innerTypeProperties().enableServerCertificateValidation();
    }

    /**
     * Set the enableServerCertificateValidation property: Whether to validate server side SSL certificate when
     * connecting to the endpoint.The default value is true. Type: boolean (or Expression with resultType boolean).
     *
     * @param enableServerCertificateValidation the enableServerCertificateValidation value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService withEnableServerCertificateValidation(Object enableServerCertificateValidation) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new RestServiceLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEnableServerCertificateValidation(enableServerCertificateValidation);
        return this;
    }

    /**
     * Get the authenticationType property: Type of authentication used to connect to the REST service.
     *
     * @return the authenticationType value.
     */
    public RestServiceAuthenticationType authenticationType() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().authenticationType();
    }

    /**
     * Set the authenticationType property: Type of authentication used to connect to the REST service.
     *
     * @param authenticationType the authenticationType value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService withAuthenticationType(RestServiceAuthenticationType authenticationType) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new RestServiceLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAuthenticationType(authenticationType);
        return this;
    }

    /**
     * Get the username property: The user name used in Basic authentication type.
     *
     * @return the username value.
     */
    public Object username() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().username();
    }

    /**
     * Set the username property: The user name used in Basic authentication type.
     *
     * @param username the username value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService withUsername(Object username) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new RestServiceLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUsername(username);
        return this;
    }

    /**
     * Get the password property: The password used in Basic authentication type.
     *
     * @return the password value.
     */
    public SecretBase password() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().password();
    }

    /**
     * Set the password property: The password used in Basic authentication type.
     *
     * @param password the password value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService withPassword(SecretBase password) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new RestServiceLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withPassword(password);
        return this;
    }

    /**
     * Get the authHeaders property: The additional HTTP headers in the request to RESTful API used for authorization.
     * Type: object (or Expression with resultType object).
     *
     * @return the authHeaders value.
     */
    public Object authHeaders() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().authHeaders();
    }

    /**
     * Set the authHeaders property: The additional HTTP headers in the request to RESTful API used for authorization.
     * Type: object (or Expression with resultType object).
     *
     * @param authHeaders the authHeaders value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService withAuthHeaders(Object authHeaders) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new RestServiceLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAuthHeaders(authHeaders);
        return this;
    }

    /**
     * Get the servicePrincipalId property: The application's client ID used in AadServicePrincipal authentication type.
     *
     * @return the servicePrincipalId value.
     */
    public Object servicePrincipalId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().servicePrincipalId();
    }

    /**
     * Set the servicePrincipalId property: The application's client ID used in AadServicePrincipal authentication type.
     *
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService withServicePrincipalId(Object servicePrincipalId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new RestServiceLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withServicePrincipalId(servicePrincipalId);
        return this;
    }

    /**
     * Get the servicePrincipalKey property: The application's key used in AadServicePrincipal authentication type.
     *
     * @return the servicePrincipalKey value.
     */
    public SecretBase servicePrincipalKey() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().servicePrincipalKey();
    }

    /**
     * Set the servicePrincipalKey property: The application's key used in AadServicePrincipal authentication type.
     *
     * @param servicePrincipalKey the servicePrincipalKey value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService withServicePrincipalKey(SecretBase servicePrincipalKey) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new RestServiceLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withServicePrincipalKey(servicePrincipalKey);
        return this;
    }

    /**
     * Get the tenant property: The tenant information (domain name or tenant ID) used in AadServicePrincipal
     * authentication type under which your application resides.
     *
     * @return the tenant value.
     */
    public Object tenant() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().tenant();
    }

    /**
     * Set the tenant property: The tenant information (domain name or tenant ID) used in AadServicePrincipal
     * authentication type under which your application resides.
     *
     * @param tenant the tenant value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService withTenant(Object tenant) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new RestServiceLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withTenant(tenant);
        return this;
    }

    /**
     * Get the azureCloudType property: Indicates the azure cloud type of the service principle auth. Allowed values are
     * AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type.
     * Type: string (or Expression with resultType string).
     *
     * @return the azureCloudType value.
     */
    public Object azureCloudType() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().azureCloudType();
    }

    /**
     * Set the azureCloudType property: Indicates the azure cloud type of the service principle auth. Allowed values are
     * AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type.
     * Type: string (or Expression with resultType string).
     *
     * @param azureCloudType the azureCloudType value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService withAzureCloudType(Object azureCloudType) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new RestServiceLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAzureCloudType(azureCloudType);
        return this;
    }

    /**
     * Get the aadResourceId property: The resource you are requesting authorization to use.
     *
     * @return the aadResourceId value.
     */
    public Object aadResourceId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().aadResourceId();
    }

    /**
     * Set the aadResourceId property: The resource you are requesting authorization to use.
     *
     * @param aadResourceId the aadResourceId value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService withAadResourceId(Object aadResourceId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new RestServiceLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAadResourceId(aadResourceId);
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object encryptedCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().encryptedCredential();
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService withEncryptedCredential(Object encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new RestServiceLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEncryptedCredential(encryptedCredential);
        return this;
    }

    /**
     * Get the credential property: The credential reference containing authentication information.
     *
     * @return the credential value.
     */
    public CredentialReference credential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().credential();
    }

    /**
     * Set the credential property: The credential reference containing authentication information.
     *
     * @param credential the credential value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService withCredential(CredentialReference credential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new RestServiceLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withCredential(credential);
        return this;
    }

    /**
     * Get the clientId property: The client ID associated with your application. Type: string (or Expression with
     * resultType string).
     *
     * @return the clientId value.
     */
    public Object clientId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().clientId();
    }

    /**
     * Set the clientId property: The client ID associated with your application. Type: string (or Expression with
     * resultType string).
     *
     * @param clientId the clientId value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService withClientId(Object clientId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new RestServiceLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withClientId(clientId);
        return this;
    }

    /**
     * Get the clientSecret property: The client secret associated with your application.
     *
     * @return the clientSecret value.
     */
    public SecretBase clientSecret() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().clientSecret();
    }

    /**
     * Set the clientSecret property: The client secret associated with your application.
     *
     * @param clientSecret the clientSecret value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService withClientSecret(SecretBase clientSecret) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new RestServiceLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withClientSecret(clientSecret);
        return this;
    }

    /**
     * Get the tokenEndpoint property: The token endpoint of the authorization server to acquire access token. Type:
     * string (or Expression with resultType string).
     *
     * @return the tokenEndpoint value.
     */
    public Object tokenEndpoint() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().tokenEndpoint();
    }

    /**
     * Set the tokenEndpoint property: The token endpoint of the authorization server to acquire access token. Type:
     * string (or Expression with resultType string).
     *
     * @param tokenEndpoint the tokenEndpoint value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService withTokenEndpoint(Object tokenEndpoint) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new RestServiceLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withTokenEndpoint(tokenEndpoint);
        return this;
    }

    /**
     * Get the resource property: The target service or resource to which the access will be requested. Type: string (or
     * Expression with resultType string).
     *
     * @return the resource value.
     */
    public Object resource() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().resource();
    }

    /**
     * Set the resource property: The target service or resource to which the access will be requested. Type: string (or
     * Expression with resultType string).
     *
     * @param resource the resource value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService withResource(Object resource) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new RestServiceLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withResource(resource);
        return this;
    }

    /**
     * Get the scope property: The scope of the access required. It describes what kind of access will be requested.
     * Type: string (or Expression with resultType string).
     *
     * @return the scope value.
     */
    public Object scope() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().scope();
    }

    /**
     * Set the scope property: The scope of the access required. It describes what kind of access will be requested.
     * Type: string (or Expression with resultType string).
     *
     * @param scope the scope value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService withScope(Object scope) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new RestServiceLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withScope(scope);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerTypeProperties in model RestServiceLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RestServiceLinkedService.class);
}

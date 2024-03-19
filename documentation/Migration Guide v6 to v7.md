# Migrating from version 6.x.x to 7.0.0

## Java version

Since Oracle's extended support for Java 7 has ended in 2022, the minimum Java version has changed from Java 6 to Java 8. If you're still using Java 6 or 7 you need to update to Java 8.

## Dependency

The `groupId` has changed to `com.worldline-solutions.connect`. You need to update your dependencies:

* Maven:
    ```xml
    <dependency>
      <groupId>com.worldline-solutions.connect</groupId>
      <artifactId>connect-sdk-java</artifactId>
      <version>7.0.0</version>
    </dependency>
    ```

* Gradle:
    ```groovy
    compile 'com.worldline-solutions.connect:connect-sdk-java:7.0.0'
    ```

### Module descriptor

An automatic module name is now defined: `com.worldline.connect.sdk.java`. If your project contains a module descriptor you should now be able to include the SDK as a dependency:

```java
requires com.worldline.connect.sdk.java;
```

## Imports

All package names have been renamed, and some classes and interfaces have moved to different packages. Each API version now has its own package structure that contains all classes specific for that version, including classes like `APIError`, exceptions and webhooks classes.

You need to change your imports as follows:

| Previous package                                      | Class / interface            | New package                                   | Notes |
|-------------------------------------------------------|------------------------------|-----------------------------------------------|-------|
| com.ingenico.connect.gateway.sdk.java                 | ApiException                 | com.worldline.connect.sdk.java.v1             |
| com.ingenico.connect.gateway.sdk.java                 | Authenticator                | com.worldline.connect.sdk.java.authentication |
| com.ingenico.connect.gateway.sdk.java                 | AuthorizationException       | com.worldline.connect.sdk.java.v1             |
| com.ingenico.connect.gateway.sdk.java                 | CommunicationException       | com.worldline.connect.sdk.java.communication  |
| com.ingenico.connect.gateway.sdk.java                 | Connection                   | com.worldline.connect.sdk.java.communication  |
| com.ingenico.connect.gateway.sdk.java                 | DeclinedPaymentException     | com.worldline.connect.sdk.java.v1             |
| com.ingenico.connect.gateway.sdk.java                 | DeclinedPayoutException      | com.worldline.connect.sdk.java.v1             |
| com.ingenico.connect.gateway.sdk.java                 | DeclinedRefundException      | com.worldline.connect.sdk.java.v1             |
| com.ingenico.connect.gateway.sdk.java                 | DeclinedTransactionException | com.worldline.connect.sdk.java.v1             |
| com.ingenico.connect.gateway.sdk.java                 | GlobalCollectException       | com.worldline.connect.sdk.java.v1             |
| com.ingenico.connect.gateway.sdk.java                 | IdempotenceException         | com.worldline.connect.sdk.java.v1             |
| com.ingenico.connect.gateway.sdk.java                 | Marshaller                   | com.worldline.connect.sdk.java.json           |
| com.ingenico.connect.gateway.sdk.java                 | MarshallerSyntaxException    | com.worldline.connect.sdk.java.json           |
| com.ingenico.connect.gateway.sdk.java                 | MetaDataProvider             | com.worldline.connect.sdk.java.communication  |
| com.ingenico.connect.gateway.sdk.java                 | MetaDataProviderBuilder      | com.worldline.connect.sdk.java.communication  |
| com.ingenico.connect.gateway.sdk.java                 | MultipartFormDataObject      | com.worldline.connect.sdk.java.communication  |
| com.ingenico.connect.gateway.sdk.java                 | MultipartFormDataRequest     | com.worldline.connect.sdk.java.communication  |
| com.ingenico.connect.gateway.sdk.java                 | NotFoundException            | com.worldline.connect.sdk.java.communication  |
| com.ingenico.connect.gateway.sdk.java                 | ParamRequest                 | com.worldline.connect.sdk.java.communication  |
| com.ingenico.connect.gateway.sdk.java                 | PooledConnection             | com.worldline.connect.sdk.java.communication  |
| com.ingenico.connect.gateway.sdk.java                 | ReferenceException           | com.worldline.connect.sdk.java.v1             |
| com.ingenico.connect.gateway.sdk.java                 | RequestHeader                | com.worldline.connect.sdk.java.communication  |
| com.ingenico.connect.gateway.sdk.java                 | RequestParam                 | com.worldline.connect.sdk.java.communication  |
| com.ingenico.connect.gateway.sdk.java                 | ResponseException            | com.worldline.connect.sdk.java.communication  |
| com.ingenico.connect.gateway.sdk.java                 | ResponseHandler              | com.worldline.connect.sdk.java.communication  |
| com.ingenico.connect.gateway.sdk.java                 | ResponseHeader               | com.worldline.connect.sdk.java.communication  |
| com.ingenico.connect.gateway.sdk.java                 | UploadableFile               | com.worldline.connect.sdk.java.domain         |
| com.ingenico.connect.gateway.sdk.java                 | ValidationException          | com.worldline.connect.sdk.java.v1             |
| com.ingenico.connect.gateway.sdk.java                 | All other classes            | com.worldline.connect.sdk.java                |
| com.ingenico.connect.gateway.sdk.java.defaultimpl     | AuthorizationType            | com.worldline.connect.sdk.java.authentication |
| com.ingenico.connect.gateway.sdk.java.defaultimpl     | DefaultAuthenticator         | com.worldline.connect.sdk.java.authentication |
| com.ingenico.connect.gateway.sdk.java.defaultimpl     | DefaultConnection            | com.worldline.connect.sdk.java.communication  |
| com.ingenico.connect.gateway.sdk.java.defaultimpl     | DefaultConnectionBuilder     | com.worldline.connect.sdk.java.communication  |
| com.ingenico.connect.gateway.sdk.java.defaultimpl     | DefaultMarshaller            | com.worldline.connect.sdk.java.json           |
| com.ingenico.connect.gateway.sdk.java.domain.metadata | ShoppingCartExtension        | com.worldline.connect.sdk.java.domain         |
| com.ingenico.connect.gateway.sdk.java.domain.*        | All other domain classes     | com.worldline.connect.sdk.java.v1.domain      | All domain classes for version 1 of the API are now in the same package |
| com.ingenico.connect.gateway.sdk.java.logging         | All classes                  | com.worldline.connect.sdk.java.logging        |
| com.ingenico.connect.gateway.sdk.java.merchant.*      | All classes                  | com.worldline.connect.sdk.java.v1.merchant.*  | The same package structure is used |
| com.ingenico.connect.gateway.sdk.java.webhooks        | WebhooksHelper               | com.worldline.connect.sdk.java.v1.webhooks    |
| com.ingenico.connect.gateway.sdk.java.webhooks        | WebhooksHelperBuilder        | com.worldline.connect.sdk.java.v1.webhooks    |
| com.ingenico.connect.gateway.sdk.java.webhooks        | All other classes            | com.worldline.connect.sdk.java.webhooks       |

## API calls

Method `merchant` of class `Client` has moved to new class `V1Client`. Instances of this class are available through method `v1` of class `Client`. You need to replace all occurrences of `.merchant` with `.v1().merchant` in your code. For instance:

```java
TestConnection response = client.v1().merchant(merchantId).services().testconnection();
```

## API version

Constant `API_VERSION` of class `Client` has been removed. You need to replace all occurrences in your code with string literal `"v1"`.

## ApiResource

Method `createException` of class `ApiResource` has been removed. You need to replace all occurrences in your code with instances of new class `ExceptionFactory`. Note that this class is specific for version 1 of the API.

## GlobalCollectException

Class `GlobalCollectException` has been renamed to `PlatformException`. You need to replace all occurrences in your code with the new name.

## Session

Class `Session` has been integrated into class `Communicator`. Because class `Session` no longer exists, class `SessionBuilder` has been replaced with class `CommunicatorBuilder`, and the `createSessionBuilder` methods of class `Factory` have been replaced with `createCommunicatorBuilder` methods.

If you used class `Factory` to instantiate class `SessionBuilder` you need to use the new `createCommunicatorBuilder` methods instead. For instance:

```java
Communicator communicator = Factory.createCommunicatorBuilder(propertiesUrl.toURI(), "apiKeyId", "secretApiKey")
        .withConnection(connection)
        .build();
Client client = Factory.createClient(communicator);
```

If you instantiated class `Session` directly you can use the newly added `createCommunicator` and `createClient` methods of class `Factory`. These have the same parameters that the `Session` constructor did. For instance:

```java
Communicator communicator = Factory.createCommunicator(apiEndpoint, connection, authenticator, metadataProvider);
```

Alternatively, you can call the `Communicator` constructor directly:

```java
Communicator communicator = new Communicator(apiEndpoint, connection, authenticator, metadataProvider, marshaller);
```

## Authentication

### Authenticator

The `createSimpleAuthenticationSignature` method of interface `Authenticator` has been renamed to `getAuthorization`. You need to replace all occurrences in your code with the new name.

### DefaultAuthenticator

Class `DefaultAuthenticator` has been renamed to `V1HMACAuthenticator`. You need to replace all occurrences in your code with the new name.

The `authorizationType` parameter has been dropped from the constructor, as it should always be `V1HMAC`. You need to remove the first argument for all calls to the constructor in your code.

## Communication

### Connection

Interface `Connection` now extends interface `ObfuscationCapable`. You need to implement the `setBodyObfuscator` and `setHeaderObfuscator` methods in all custom implementations.

## Metadata

### MetaDataProvider and MetaDataProviderBuilder

Class `MetaDataProvider`, its `getServerMetaDataHeaders` method and class `MetaDataProviderBuilder` used incorrect capitalization. These have been renamed to `MetadataProvider`, `getServerMetadataHeaders` and `MetadataProviderBuilder` respectively. You need to replace all occurrences in your code with the new names.

### Integrator

The integrator is now required. When using a properties file to initialize the SDK, you need to make sure that key `connect.api.integrator` is present with a non-empty value. Otherwise, you need to make sure a non-empty integrator is set on any `CommunicatorConfiguration`, `MetadataProviderBuilder` or `MetadataProvider` instance you create.

## Webhooks

### Creating webhooks helpers

Methods `createHelper` and `createHelperBuilder` of class `Webhooks` have moved to new class `V1WebhooksFactory`. Instances of this class are available through method `v1` of class `Webhooks`. You need to include `.v1()` for all occurrences of `Webhooks.createHelper` and `Webhooks.createHelperBuilder` in your code. For instance: 

```java
WebhooksHelper helper = Webhooks.v1().createHelper(InMemorySecretKeyStore.INSTANCE);
```

### WebhooksHelper

The protected `validate` methods of class `WebhooksHelper` have been removed. You need to replace all occurrences in your code with a `SignatureValidator`.

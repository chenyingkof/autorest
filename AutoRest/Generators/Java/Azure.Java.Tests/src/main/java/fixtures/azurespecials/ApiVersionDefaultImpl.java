/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.12.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.CloudError;
import com.microsoft.rest.Resource;
import com.microsoft.rest.SubResource;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import com.microsoft.rest.ServiceResponseEmptyCallback;
import com.squareup.okhttp.ResponseBody;
import retrofit.Retrofit;
import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import java.io.IOException;
import retrofit.http.GET;
import retrofit.http.Query;
import retrofit.http.Header;

public class ApiVersionDefaultImpl implements ApiVersionDefault {
    private ApiVersionDefaultService service;
    AutoRestAzureSpecialParametersTestClient client;

    public ApiVersionDefaultImpl(Retrofit retrofit, AutoRestAzureSpecialParametersTestClient client) {
        this.service = retrofit.create(ApiVersionDefaultService.class);
        this.client = client;
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<Void> getMethodGlobalValid() throws ServiceException {
        if (this.client.getApiVersion() == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
        }
        try {
            Call<ResponseBody> call = service.getMethodGlobalValid(this.client.getApiVersion(), this.client.getAcceptLanguage());
            return getMethodGlobalValidDelegate(call.execute(), null);
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getMethodGlobalValidAsync(final ServiceCallback<Void> serviceCallback) {
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.")));
        }
        Call<ResponseBody> call = service.getMethodGlobalValid(this.client.getApiVersion(), this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getMethodGlobalValidDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> getMethodGlobalValidDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<Void> getMethodGlobalNotProvidedValid() throws ServiceException {
        if (this.client.getApiVersion() == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
        }
        try {
            Call<ResponseBody> call = service.getMethodGlobalNotProvidedValid(this.client.getApiVersion(), this.client.getAcceptLanguage());
            return getMethodGlobalNotProvidedValidDelegate(call.execute(), null);
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getMethodGlobalNotProvidedValidAsync(final ServiceCallback<Void> serviceCallback) {
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.")));
        }
        Call<ResponseBody> call = service.getMethodGlobalNotProvidedValid(this.client.getApiVersion(), this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getMethodGlobalNotProvidedValidDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> getMethodGlobalNotProvidedValidDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<Void> getPathGlobalValid() throws ServiceException {
        if (this.client.getApiVersion() == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
        }
        try {
            Call<ResponseBody> call = service.getPathGlobalValid(this.client.getApiVersion(), this.client.getAcceptLanguage());
            return getPathGlobalValidDelegate(call.execute(), null);
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getPathGlobalValidAsync(final ServiceCallback<Void> serviceCallback) {
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.")));
        }
        Call<ResponseBody> call = service.getPathGlobalValid(this.client.getApiVersion(), this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getPathGlobalValidDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> getPathGlobalValidDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<Void> getSwaggerGlobalValid() throws ServiceException {
        if (this.client.getApiVersion() == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
        }
        try {
            Call<ResponseBody> call = service.getSwaggerGlobalValid(this.client.getApiVersion(), this.client.getAcceptLanguage());
            return getSwaggerGlobalValidDelegate(call.execute(), null);
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getSwaggerGlobalValidAsync(final ServiceCallback<Void> serviceCallback) {
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.")));
        }
        Call<ResponseBody> call = service.getSwaggerGlobalValid(this.client.getApiVersion(), this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getSwaggerGlobalValidDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> getSwaggerGlobalValidDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

}

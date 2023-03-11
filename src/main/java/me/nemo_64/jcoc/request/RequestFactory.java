package me.nemo_64.jcoc.request;

import me.nemo_64.jcoc.ApiKey;
import me.nemo_64.jcoc.entity.IdentityTag;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;
import java.util.Objects;
import java.util.function.Supplier;

import static me.nemo_64.jcoc.request.Endpoints.*;

public class RequestFactory {

    private final String baseUrl;
    private final Supplier<ApiKey> keySupplier;

    public static final RequestFactory simpleFactory(String baseUrl, Supplier<ApiKey> keySupplier) {
        return new RequestFactory(Objects.requireNonNull(baseUrl ,"baseUrl"),
                Objects.requireNonNull(keySupplier, "keySupplier"));
    }

    private RequestFactory(String baseUrl, Supplier<ApiKey> keySupplier) {
        this.baseUrl = baseUrl;
        this.keySupplier = keySupplier;
    }

    private HttpRequest.Builder baseRequest(String endpoint) {
        try {
            return HttpRequest.newBuilder(new URI(baseUrl + endpoint))
                    .header("Authorization", "Bearer " + keySupplier.get().key());
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    public HttpRequest createPlayerRequest(IdentityTag tag) {
        return baseRequest(GET_PLAYER.replace("{playerTag}", tag.urlEncoded())).build();
    }

}

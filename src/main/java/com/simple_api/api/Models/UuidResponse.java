package com.simple_api.api.Models;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;

@Builder
public class UuidResponse {

    @SerializedName("is_generated")
    private final boolean isGenerated;

    @SerializedName("uuid")
    private final String uuid;
}

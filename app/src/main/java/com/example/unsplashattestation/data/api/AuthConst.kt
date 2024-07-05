package com.example.unsplashattestation.data.api

const val ACCESS_KEY = "DyStZICDtFEVKSzlzz3_0JSgys3tnHUIRZ-yEAXbC7s"
const val SECRET_KEY = "mN7zIKxB69Ll5Ev6ztw7kVwuI1Ed_F2yAAGy70QzVhw"
const val REDIRECT_URI = "urn:ietf:wg:oauth:2.0:oob"
const val SCOPE =
    "public+read_user+" +
            "write_user+read_photos+" +
            "write_photos+" +
            "write_likes+" +
            "write_followers+" +
            "read_collections+" +
            "write_collections"

const val CALL =
    "https://unsplash.com/oauth/authorize" +
            "?client_id=" + ACCESS_KEY +
            "&redirect_uri=" + REDIRECT_URI +
            "&response_type=code" +
            "&scope=" + SCOPE


const val TOKEN_SHARED_NAME = "pref_token"
const val TOKEN_SHARED_KEY = "token"
const val TOKEN_ENABLED_KEY = "token_enabled"
const val ONBOARDING_IS_SHOWN = "onboarding_is_shown"


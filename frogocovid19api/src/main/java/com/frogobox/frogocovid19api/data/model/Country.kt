package com.frogobox.frogocovid19api.data.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * Covid19Api
 * Copyright (C) 18/03/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogocovid19api.data.model
 *
 */
data class Country(

    @SerializedName("Country")
    var country : String? = null,

    @SerializedName("Slug")
    var slug : String? = null,

    @SerializedName("Provinces")
    var provinces : List<String>? = null


)
package apicontroller.characterdata

import data.characterdata.Alignment
import io.ktor.client.*
import io.ktor.client.request.*
import apicontroller.APIControllerBase

class AlignmentsAPI : APIControllerBase() {

    override var SITE_URL = "alignments/"

    suspend fun getAlignment(index: String) : Alignment{
        return client.get("$BASE_URL$SITE_URL$index")
    }
}
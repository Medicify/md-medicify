package com.medicify.app.data.model

import com.google.gson.annotations.SerializedName

data class DrugItem(

	@field:SerializedName("image")
	val image: String,

	@field:SerializedName("bpom")
	val bpom: String?,

	@field:SerializedName("product_url")
	val productUrl: String,

	@field:SerializedName("package")
	val jsonMemberPackage: String?,

	@field:SerializedName("manufactur")
	val manufactur: String,

	@field:SerializedName("description")
	val description: String?,

	@field:SerializedName("how_to_use")
	val howToUse: String?,

	@field:SerializedName("title")
	val title: String,

	@field:SerializedName("type")
	val type: String?,

	@field:SerializedName("product_class")
	val productClass: String,

	@field:SerializedName("dose")
	val dose: String?,

	@field:SerializedName("attention")
	val attention: String?,

	@field:SerializedName("compotition")
	val compotition: String?,

	@field:SerializedName("id")
	val id: String,

	@field:SerializedName("indication")
	val indication: String?,

	@field:SerializedName("indication_contra")
	val indicationContra: String?,

	@field:SerializedName("side_effect")
	val sideEffect: String?,

	@field:SerializedName("custom_image")
	val imageCustom: String
)
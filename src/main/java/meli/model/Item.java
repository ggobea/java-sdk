/*
 * MELI Markeplace SDK
 * This is a the codebase to generate a SDK for Open Platform Marketplace
 *
 * The version of the OpenAPI document: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package meli.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Item
 */

public class Item {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private Map<String,Object> location;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "category_id";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private String categoryId;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Integer price;

  public static final String SERIALIZED_NAME_CURRENCY_ID = "currency_id";
  @SerializedName(SERIALIZED_NAME_CURRENCY_ID)
  private String currencyId;

  public static final String SERIALIZED_NAME_AVAILABLE_QUANTITY = "available_quantity";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_QUANTITY)
  private String availableQuantity;

  public static final String SERIALIZED_NAME_BUYING_MODE = "buying_mode";
  @SerializedName(SERIALIZED_NAME_BUYING_MODE)
  private String buyingMode;

  public static final String SERIALIZED_NAME_LISTING_TYPE_ID = "listing_type_id";
  @SerializedName(SERIALIZED_NAME_LISTING_TYPE_ID)
  private String listingTypeId;

  public static final String SERIALIZED_NAME_CONDITION = "condition";
  @SerializedName(SERIALIZED_NAME_CONDITION)
  private String condition;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId;

  public static final String SERIALIZED_NAME_PICTURES = "pictures";
  @SerializedName(SERIALIZED_NAME_PICTURES)
  private List<ItemPictures> pictures = new ArrayList<ItemPictures>();

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private List<Attributes> attributes = null;

  public static final String SERIALIZED_NAME_VARIATIONS = "variations";
  @SerializedName(SERIALIZED_NAME_VARIATIONS)
  private List<Variations> variations = null;


  public Item title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "Item de test - No Ofertar", required = true, value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }

  public Item location(Map<String,Object> location) {

    this.location = location;
    return this;
  }

  /**
   * Get title
   * @return title
   **/
  @ApiModelProperty(example = "{}", required = true, value = "")

  public Map<String,Object> getLocation() {
    return location;
  }

  public void setLocation(Map<String,Object> location) {
    this.location = location;
  }

  public Item categoryId(String categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Get categoryId
   * @return categoryId
  **/
  @ApiModelProperty(example = "MLA5991", required = true, value = "")

  public String getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }


  public Item price(Integer price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(example = "350", required = true, value = "")

  public Integer getPrice() {
    return price;
  }


  public void setPrice(Integer price) {
    this.price = price;
  }


  public Item currencyId(String currencyId) {
    
    this.currencyId = currencyId;
    return this;
  }

   /**
   * Get currencyId
   * @return currencyId
  **/
  @ApiModelProperty(example = "ARS", required = true, value = "")

  public String getCurrencyId() {
    return currencyId;
  }


  public void setCurrencyId(String currencyId) {
    this.currencyId = currencyId;
  }


  public Item availableQuantity(String availableQuantity) {
    
    this.availableQuantity = availableQuantity;
    return this;
  }

   /**
   * Get availableQuantity
   * @return availableQuantity
  **/
  @ApiModelProperty(example = "12", required = true, value = "")

  public String getAvailableQuantity() {
    return availableQuantity;
  }


  public void setAvailableQuantity(String availableQuantity) {
    this.availableQuantity = availableQuantity;
  }


  public Item buyingMode(String buyingMode) {
    
    this.buyingMode = buyingMode;
    return this;
  }

   /**
   * Get buyingMode
   * @return buyingMode
  **/
  @ApiModelProperty(example = "buy_it_now", required = true, value = "")

  public String getBuyingMode() {
    return buyingMode;
  }


  public void setBuyingMode(String buyingMode) {
    this.buyingMode = buyingMode;
  }


  public Item listingTypeId(String listingTypeId) {
    
    this.listingTypeId = listingTypeId;
    return this;
  }

   /**
   * Get listingTypeId
   * @return listingTypeId
  **/
  @ApiModelProperty(example = "bronze", required = true, value = "")

  public String getListingTypeId() {
    return listingTypeId;
  }


  public void setListingTypeId(String listingTypeId) {
    this.listingTypeId = listingTypeId;
  }


  public Item condition(String condition) {
    
    this.condition = condition;
    return this;
  }

   /**
   * Get condition
   * @return condition
  **/
  @ApiModelProperty(example = "new", required = true, value = "")

  public String getCondition() {
    return condition;
  }


  public void setCondition(String condition) {
    this.condition = condition;
  }


  public Item description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "Item de Teste. Mercado Livre SDK", required = true, value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Item videoId(String videoId) {
    
    this.videoId = videoId;
    return this;
  }

   /**
   * Get videoId
   * @return videoId
  **/
  @ApiModelProperty(example = "RXWn6kftTHY", required = true, value = "")

  public String getVideoId() {
    return videoId;
  }


  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }


  public Item pictures(List<ItemPictures> pictures) {
    
    this.pictures = pictures;
    return this;
  }

  public Item addPicturesItem(ItemPictures picturesItem) {
    this.pictures.add(picturesItem);
    return this;
  }

   /**
   * Get pictures
   * @return pictures
  **/
  @ApiModelProperty(required = true, value = "")

  public List<ItemPictures> getPictures() {
    return pictures;
  }


  public void setPictures(List<ItemPictures> pictures) {
    this.pictures = pictures;
  }


  public Item attributes(List<Attributes> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public Item addAttributesItem(Attributes attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<Attributes>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Attributes> getAttributes() {
    return attributes;
  }


  public void setAttributes(List<Attributes> attributes) {
    this.attributes = attributes;
  }


  public Item variations(List<Variations> variations) {
    
    this.variations = variations;
    return this;
  }

  public Item addVariationsItem(Variations variationsItem) {
    if (this.variations == null) {
      this.variations = new ArrayList<Variations>();
    }
    this.variations.add(variationsItem);
    return this;
  }

   /**
   * Get variations
   * @return variations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Variations> getVariations() {
    return variations;
  }


  public void setVariations(List<Variations> variations) {
    this.variations = variations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(this.title, item.title) &&
        Objects.equals(this.categoryId, item.categoryId) &&
        Objects.equals(this.price, item.price) &&
        Objects.equals(this.currencyId, item.currencyId) &&
        Objects.equals(this.availableQuantity, item.availableQuantity) &&
        Objects.equals(this.buyingMode, item.buyingMode) &&
        Objects.equals(this.listingTypeId, item.listingTypeId) &&
        Objects.equals(this.condition, item.condition) &&
        Objects.equals(this.description, item.description) &&
        Objects.equals(this.videoId, item.videoId) &&
        Objects.equals(this.pictures, item.pictures) &&
        Objects.equals(this.attributes, item.attributes) &&
        Objects.equals(this.variations, item.variations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, categoryId, price, currencyId, availableQuantity, buyingMode, listingTypeId, condition, description, videoId, pictures, attributes, variations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    availableQuantity: ").append(toIndentedString(availableQuantity)).append("\n");
    sb.append("    buyingMode: ").append(toIndentedString(buyingMode)).append("\n");
    sb.append("    listingTypeId: ").append(toIndentedString(listingTypeId)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    pictures: ").append(toIndentedString(pictures)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    variations: ").append(toIndentedString(variations)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.SerializedName;
import pojo.Fees;
import pojo.Promotions;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Sandbox {


    @SerializedName("CategoryId")
    Integer CategoryId;

    @SerializedName("Name")
    String Name;

    @SerializedName("Path")
    String Path;

    @SerializedName("CanListAuctions")
    boolean CanListAuctions;

    @SerializedName("CanListClassifieds")
    boolean CanListClassifieds;

    @SerializedName("CanRelist")
    boolean CanRelist;

    @SerializedName("LegalNotice")
    String LegalNotice;

    @SerializedName("DefaultDuration")
    int DefaultDuration;

    @SerializedName("AllowedDurations")
    List<Integer> AllowedDurations;

    @SerializedName("pojo.Fees")
    pojo.Fees Fees;

    @SerializedName("FreePhotoCount")
    int FreePhotoCount;

    @SerializedName("MaximumPhotoCount")
    int MaximumPhotoCount;

    @SerializedName("IsFreeToRelist")
    boolean IsFreeToRelist;

    @SerializedName("pojo.Promotions")
    List<Promotions> Promotions;

    @SerializedName("EmbeddedContentOptions")
    List<String> EmbeddedContentOptions;

    @SerializedName("MaximumTitleLength")
    int MaximumTitleLength;

    @SerializedName("AreaOfBusiness")
    int AreaOfBusiness;

    @SerializedName("DefaultRelistDuration")
    int DefaultRelistDuration;

    @SerializedName("CanUseCounterOffers")
    boolean CanUseCounterOffers;

//    public pojo.Sandbox(int categoryId, String name, String path, boolean canListAuctions, boolean canListClassifieds, boolean canRelist, String legalNotice, int defaultDuration, List<Integer> allowedDurations, pojo.Fees fees, int freePhotoCount, int maximumPhotoCount, boolean isFreeToRelist, List<pojo.Promotions> promotions, List<String> embeddedContentOptions, int maximumTitleLength, int areaOfBusiness, int defaultRelistDuration, boolean canUseCounterOffers) {
//        CategoryId = categoryId;
//        Name = name;
//        Path = path;
//        CanListAuctions = canListAuctions;
//        CanListClassifieds = canListClassifieds;
//        CanRelist = canRelist;
//        LegalNotice = legalNotice;
//        DefaultDuration = defaultDuration;
//        AllowedDurations = allowedDurations;
//        pojo.Fees = fees;
//        FreePhotoCount = freePhotoCount;
//        MaximumPhotoCount = maximumPhotoCount;
//        IsFreeToRelist = isFreeToRelist;
//        pojo.Promotions = promotions;
//        EmbeddedContentOptions = embeddedContentOptions;
//        MaximumTitleLength = maximumTitleLength;
//        AreaOfBusiness = areaOfBusiness;
//        DefaultRelistDuration = defaultRelistDuration;
//        CanUseCounterOffers = canUseCounterOffers;
//    }


    public void setCategoryId(Integer CategoryId) {
        this.CategoryId = CategoryId;
    }
    public Integer getCategoryId() {
        return CategoryId;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    public String getName() {
        return Name;
    }

    public void setPath(String Path) {
        this.Path = Path;
    }
    public String getPath() {
        return Path;
    }

    public void setCanListAuctions(boolean CanListAuctions) {
        this.CanListAuctions = CanListAuctions;
    }
    public boolean getCanListAuctions() {
        return CanListAuctions;
    }

    public void setCanListClassifieds(boolean CanListClassifieds) {
        this.CanListClassifieds = CanListClassifieds;
    }
    public boolean getCanListClassifieds() {
        return CanListClassifieds;
    }

    public void setCanRelist(boolean CanRelist) {
        this.CanRelist = CanRelist;
    }
    public boolean getCanRelist() {
        return CanRelist;
    }

    public void setLegalNotice(String LegalNotice) {
        this.LegalNotice = LegalNotice;
    }
    public String getLegalNotice() {
        return LegalNotice;
    }

    public void setDefaultDuration(int DefaultDuration) {
        this.DefaultDuration = DefaultDuration;
    }
    public int getDefaultDuration() {
        return DefaultDuration;
    }

    public void setAllowedDurations(List<Integer> AllowedDurations) {
        this.AllowedDurations = AllowedDurations;
    }
    public List<Integer> getAllowedDurations() {
        return AllowedDurations;
    }

    public void setFees(Fees Fees) {
        this.Fees = Fees;
    }
    public Fees getFees() {
        return Fees;
    }

    public void setFreePhotoCount(int FreePhotoCount) {
        this.FreePhotoCount = FreePhotoCount;
    }
    public int getFreePhotoCount() {
        return FreePhotoCount;
    }

    public void setMaximumPhotoCount(int MaximumPhotoCount) {
        this.MaximumPhotoCount = MaximumPhotoCount;
    }
    public int getMaximumPhotoCount() {
        return MaximumPhotoCount;
    }

    public void setIsFreeToRelist(boolean IsFreeToRelist) {
        this.IsFreeToRelist = IsFreeToRelist;
    }
    public boolean getIsFreeToRelist() {
        return IsFreeToRelist;
    }

    public void setPromotions(List<Promotions> Promotions) {
        this.Promotions = Promotions;
    }
    public List<pojo.Promotions> getPromotions() {
        return Promotions;
    }

    public void setEmbeddedContentOptions(List<String> EmbeddedContentOptions) {
        this.EmbeddedContentOptions = EmbeddedContentOptions;
    }
    public List<String> getEmbeddedContentOptions() {
        return EmbeddedContentOptions;
    }

    public void setMaximumTitleLength(int MaximumTitleLength) {
        this.MaximumTitleLength = MaximumTitleLength;
    }
    public int getMaximumTitleLength() {
        return MaximumTitleLength;
    }

    public void setAreaOfBusiness(int AreaOfBusiness) {
        this.AreaOfBusiness = AreaOfBusiness;
    }
    public int getAreaOfBusiness() {
        return AreaOfBusiness;
    }

    public void setDefaultRelistDuration(int DefaultRelistDuration) {
        this.DefaultRelistDuration = DefaultRelistDuration;
    }
    public int getDefaultRelistDuration() {
        return DefaultRelistDuration;
    }

    public void setCanUseCounterOffers(boolean CanUseCounterOffers) {
        this.CanUseCounterOffers = CanUseCounterOffers;
    }
    public boolean getCanUseCounterOffers() {
        return CanUseCounterOffers;
    }
}

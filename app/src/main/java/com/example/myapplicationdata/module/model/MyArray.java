package com.example.myapplicationdata.module.model;

 class VanillaEntity {
   private Ad_config.Tags.Data[] data;

   private String success;

   private String status;

   public Ad_config.Tags.Data[] getData() {
      return data;
   }

   public void setData(Ad_config.Tags.Data[] data) {
      this.data = data;
   }

   public String getSuccess() {
      return success;
   }

   public void setSuccess(String success) {
      this.success = success;
   }

   public String getStatus() {
      return status;
   }

   public void setStatus(String status) {
      this.status = status;
   }

   @Override
   public String toString() {
      return "ClassPojo [data = " + data + ", success = " + success + ", status = " + status + "]";
   }


   public class Ad_config {
      private String showsAds;

      private String[] unsafeFlags;

      private String[] wallUnsafeFlags;

      private String[] safeFlags;

      private String[] highRiskFlags;

      public String getShowsAds() {
         return showsAds;
      }

      public void setShowsAds(String showsAds) {
         this.showsAds = showsAds;
      }

      public String[] getUnsafeFlags() {
         return unsafeFlags;
      }

      public void setUnsafeFlags(String[] unsafeFlags) {
         this.unsafeFlags = unsafeFlags;
      }

      public String[] getWallUnsafeFlags() {
         return wallUnsafeFlags;
      }

      public void setWallUnsafeFlags(String[] wallUnsafeFlags) {
         this.wallUnsafeFlags = wallUnsafeFlags;
      }

      public String[] getSafeFlags() {
         return safeFlags;
      }

      public void setSafeFlags(String[] safeFlags) {
         this.safeFlags = safeFlags;
      }

      public String[] getHighRiskFlags() {
         return highRiskFlags;
      }

      public void setHighRiskFlags(String[] highRiskFlags) {
         this.highRiskFlags = highRiskFlags;
      }

      @Override
      public String toString() {
         return "ClassPojo [showsAds = " + showsAds + ", unsafeFlags = " + unsafeFlags + ", wallUnsafeFlags = " + wallUnsafeFlags + ", safeFlags = " + safeFlags + ", highRiskFlags = " + highRiskFlags + "]";
      }

public class Tags
{
   private String background_hash;

   private String is_promoted;

   private String background_is_animated;

   private String thumbnail_hash;

   private String description;

   private String display_name;

   private String is_whitelisted;

   private String total_items;

   private String accent;

   private String thumbnail_is_animated;

   private String followers;

   private String following;

   private String name;

   private String logo_hash;

   private String description_annotations;

   private String logo_destination_url;

   public String getBackground_hash ()
   {
      return background_hash;
   }

   public void setBackground_hash (String background_hash)
   {
      this.background_hash = background_hash;
   }

   public String getIs_promoted ()
   {
      return is_promoted;
   }

   public void setIs_promoted (String is_promoted)
   {
      this.is_promoted = is_promoted;
   }

   public String getBackground_is_animated ()
   {
      return background_is_animated;
   }

   public void setBackground_is_animated (String background_is_animated)
   {
      this.background_is_animated = background_is_animated;
   }

   public String getThumbnail_hash ()
{
   return thumbnail_hash;
}

   public void setThumbnail_hash (String thumbnail_hash)
   {
      this.thumbnail_hash = thumbnail_hash;
   }

   public String getDescription ()
   {
      return description;
   }

   public void setDescription (String description)
   {
      this.description = description;
   }

   public String getDisplay_name ()
   {
      return display_name;
   }

   public void setDisplay_name (String display_name)
   {
      this.display_name = display_name;
   }

   public String getIs_whitelisted ()
   {
      return is_whitelisted;
   }

   public void setIs_whitelisted (String is_whitelisted)
   {
      this.is_whitelisted = is_whitelisted;
   }

   public String getTotal_items ()
   {
      return total_items;
   }

   public void setTotal_items (String total_items)
   {
      this.total_items = total_items;
   }

   public String getAccent ()
   {
      return accent;
   }

   public void setAccent (String accent)
   {
      this.accent = accent;
   }

   public String getThumbnail_is_animated ()
   {
      return thumbnail_is_animated;
   }

   public void setThumbnail_is_animated (String thumbnail_is_animated)
   {
      this.thumbnail_is_animated = thumbnail_is_animated;
   }

   public String getFollowers ()
   {
      return followers;
   }

   public void setFollowers (String followers)
   {
      this.followers = followers;
   }

   public String getFollowing ()
   {
      return following;
   }

   public void setFollowing (String following)
   {
      this.following = following;
   }

   public String getName ()
   {
      return name;
   }

   public void setName (String name)
   {
      this.name = name;
   }

   public String getLogo_hash ()
{
   return logo_hash;
}

   public void setLogo_hash (String logo_hash)
   {
      this.logo_hash = logo_hash;
   }

   public String getDescription_annotations ()
   {
      return description_annotations;
   }

   public void setDescription_annotations (String description_annotations)
   {
      this.description_annotations = description_annotations;
   }

   public String getLogo_destination_url ()
{
   return logo_destination_url;
}

   public void setLogo_destination_url (String logo_destination_url)
   {
      this.logo_destination_url = logo_destination_url;
   }

   @Override
   public String toString()
   {
      return "ClassPojo [background_hash = "+background_hash+", is_promoted = "+is_promoted+", background_is_animated = "+background_is_animated+", thumbnail_hash = "+thumbnail_hash+", description = "+description+", display_name = "+display_name+", is_whitelisted = "+is_whitelisted+", total_items = "+total_items+", accent = "+accent+", thumbnail_is_animated = "+thumbnail_is_animated+", followers = "+followers+", following = "+following+", name = "+name+", logo_hash = "+logo_hash+", description_annotations = "+description_annotations+", logo_destination_url = "+logo_destination_url+"]";
   }


public class Data
{
   private String comment_count;

   private String in_most_viral;

   private String ad_type;

   private String link;

   private String description;

   private String privacy;

   private String section;

   private String cover_height;

   private String title;

   private Ad_config ad_config;

   private String points;

   private String cover;

   private String score;

   private String datetime;

   private String favorite_count;

   private String id;

   private String topic_id;

   private String in_gallery;

   private String vote;

   private String views;

   private String include_album_ads;

   //private Ad_config.Images[] images;

   private String downs;

   private String nsfw;

   private String is_ad;

   private String ad_url;

   private String images_count;

   private Tags[] tags;

   private String layout;

   private String account_id;

   private String cover_width;

   private String is_album;

   private String account_url;

   private String ups;

   private String topic;

   private String favorite;

   public String getComment_count ()
   {
      return comment_count;
   }

   public void setComment_count (String comment_count)
   {
      this.comment_count = comment_count;
   }

   public String getIn_most_viral ()
   {
      return in_most_viral;
   }

   public void setIn_most_viral (String in_most_viral)
   {
      this.in_most_viral = in_most_viral;
   }

   public String getAd_type ()
   {
      return ad_type;
   }

   public void setAd_type (String ad_type)
   {
      this.ad_type = ad_type;
   }

   public String getLink ()
   {
      return link;
   }

   public void setLink (String link)
   {
      this.link = link;
   }

   public String getDescription ()
{
   return description;
}

   public void setDescription (String description)
   {
      this.description = description;
   }

   public String getPrivacy ()
   {
      return privacy;
   }

   public void setPrivacy (String privacy)
   {
      this.privacy = privacy;
   }

   public String getSection ()
   {
      return section;
   }

   public void setSection (String section)
   {
      this.section = section;
   }

   public String getCover_height ()
   {
      return cover_height;
   }

   public void setCover_height (String cover_height)
   {
      this.cover_height = cover_height;
   }

   public String getTitle ()
   {
      return title;
   }

   public void setTitle (String title)
   {
      this.title = title;
   }

   public Ad_config getAd_config ()
   {
      return ad_config;
   }

   public void setAd_config (Ad_config ad_config)
   {
      this.ad_config = ad_config;
   }

   public String getPoints ()
   {
      return points;
   }

   public void setPoints (String points)
   {
      this.points = points;
   }

   public String getCover ()
   {
      return cover;
   }

   public void setCover (String cover)
   {
      this.cover = cover;
   }

   public String getScore ()
   {
      return score;
   }

   public void setScore (String score)
   {
      this.score = score;
   }

   public String getDatetime ()
   {
      return datetime;
   }

   public void setDatetime (String datetime)
   {
      this.datetime = datetime;
   }

   public String getFavorite_count ()
   {
      return favorite_count;
   }

   public void setFavorite_count (String favorite_count)
   {
      this.favorite_count = favorite_count;
   }

   public String getId ()
   {
      return id;
   }

   public void setId (String id)
   {
      this.id = id;
   }

   public String getTopic_id ()
   {
      return topic_id;
   }

   public void setTopic_id (String topic_id)
   {
      this.topic_id = topic_id;
   }

   public String getIn_gallery ()
   {
      return in_gallery;
   }

   public void setIn_gallery (String in_gallery)
   {
      this.in_gallery = in_gallery;
   }

   public String getVote ()
{
   return vote;
}

   public void setVote (String vote)
   {
      this.vote = vote;
   }

   public String getViews ()
   {
      return views;
   }

   public void setViews (String views)
   {
      this.views = views;
   }

   public String getInclude_album_ads ()
   {
      return include_album_ads;
   }

   public void setInclude_album_ads (String include_album_ads)
   {
      this.include_album_ads = include_album_ads;
   }

//   public Ad_config.Images[] getImages ()
//   {
//      return images;
//   }

//   public void setImages (Ad_config.Images[] images)
//   {
//      this.images = images;
//   }

   public String getDowns ()
   {
      return downs;
   }

   public void setDowns (String downs)
   {
      this.downs = downs;
   }

   public String getNsfw ()
   {
      return nsfw;
   }

   public void setNsfw (String nsfw)
   {
      this.nsfw = nsfw;
   }

   public String getIs_ad ()
   {
      return is_ad;
   }

   public void setIs_ad (String is_ad)
   {
      this.is_ad = is_ad;
   }

   public String getAd_url ()
   {
      return ad_url;
   }

   public void setAd_url (String ad_url)
   {
      this.ad_url = ad_url;
   }

   public String getImages_count ()
   {
      return images_count;
   }

   public void setImages_count (String images_count)
   {
      this.images_count = images_count;
   }

   public Tags[] getTags ()
   {
      return tags;
   }

   public void setTags (Tags[] tags)
   {
      this.tags = tags;
   }

   public String getLayout ()
   {
      return layout;
   }

   public void setLayout (String layout)
   {
      this.layout = layout;
   }

   public String getAccount_id ()
   {
      return account_id;
   }

   public void setAccount_id (String account_id)
   {
      this.account_id = account_id;
   }

   public String getCover_width ()
   {
      return cover_width;
   }

   public void setCover_width (String cover_width)
   {
      this.cover_width = cover_width;
   }

   public String getIs_album ()
   {
      return is_album;
   }

   public void setIs_album (String is_album)
   {
      this.is_album = is_album;
   }

   public String getAccount_url ()
   {
      return account_url;
   }

   public void setAccount_url (String account_url)
   {
      this.account_url = account_url;
   }

   public String getUps ()
   {
      return ups;
   }

   public void setUps (String ups)
   {
      this.ups = ups;
   }

   public String getTopic ()
   {
      return topic;
   }

   public void setTopic (String topic)
   {
      this.topic = topic;
   }

   public String getFavorite ()
   {
      return favorite;
   }

   public void setFavorite (String favorite)
   {
      this.favorite = favorite;
   }
//
//   @Override
//   public String toString()
//   {
//      return "ClassPojo [comment_count = "+comment_count+", in_most_viral = "+in_most_viral+", ad_type = "+ad_type+", link = "+link+", description = "+description+", privacy = "+privacy+", section = "+section+", cover_height = "+cover_height+", title = "+title+", ad_config = "+ad_config+", points = "+points+", cover = "+cover+", score = "+score+", datetime = "+datetime+", favorite_count = "+favorite_count+", id = "+id+", topic_id = "+topic_id+", in_gallery = "+in_gallery+", vote = "+vote+", views = "+views+", include_album_ads = "+include_album_ads+", images = "
//              +images+", downs = "+downs+", nsfw = "+nsfw+", is_ad = "+is_ad+", ad_url = "+ad_url+", images_count = "+images_count+", tags = "+tags+", layout = "+layout+", account_id = "+account_id+", cover_width = "+cover_width+", is_album = "+is_album+", account_url = "+account_url+", ups = "+ups+", topic = "+topic+", favorite = "+favorite+"]";
//   }


public class Ad_config_duplicate
{
   private String showsAds;

   private String[] unsafeFlags;

   private String[] wallUnsafeFlags;

   private String[] safeFlags;

   private String[] highRiskFlags;

   public String getShowsAds ()
   {
      return showsAds;
   }

   public void setShowsAds (String showsAds)
   {
      this.showsAds = showsAds;
   }

   public String[] getUnsafeFlags ()
   {
      return unsafeFlags;
   }

   public void setUnsafeFlags (String[] unsafeFlags)
   {
      this.unsafeFlags = unsafeFlags;
   }

   public String[] getWallUnsafeFlags ()
   {
      return wallUnsafeFlags;
   }

   public void setWallUnsafeFlags (String[] wallUnsafeFlags)
   {
      this.wallUnsafeFlags = wallUnsafeFlags;
   }

   public String[] getSafeFlags ()
   {
      return safeFlags;
   }

   public void setSafeFlags (String[] safeFlags)
   {
      this.safeFlags = safeFlags;
   }

   public String[] getHighRiskFlags ()
   {
      return highRiskFlags;
   }

   public void setHighRiskFlags (String[] highRiskFlags)
   {
      this.highRiskFlags = highRiskFlags;
   }

   @Override
   public String toString()
   {
      return "ClassPojo [showsAds = "+showsAds+", unsafeFlags = "+unsafeFlags+", wallUnsafeFlags = "+wallUnsafeFlags+", safeFlags = "+safeFlags+", highRiskFlags = "+highRiskFlags+"]";
   }

public class Images
{
   private String comment_count;

   private String in_most_viral;

   private String ad_type;

   private String link;

   private String description;

   private String section;

   private String title;

   private String type;

   private String points;

   private String score;

   private String datetime;

   private String has_sound;

   private String favorite_count;

   private String id;

   private String in_gallery;

   private String vote;

   private String views;

   private String height;

   private String downs;

   private String bandwidth;

   private String nsfw;

   private String is_ad;

   private String edited;

   private String ad_url;

   private String[] tags;

   private String account_id;

   private String size;

   private String width;

   private String account_url;

   private String animated;

   private String ups;

   private String favorite;

   public String getComment_count ()
{
   return comment_count;
}

   public void setComment_count (String comment_count)
   {
      this.comment_count = comment_count;
   }

   public String getIn_most_viral ()
   {
      return in_most_viral;
   }

   public void setIn_most_viral (String in_most_viral)
   {
      this.in_most_viral = in_most_viral;
   }

   public String getAd_type ()
   {
      return ad_type;
   }

   public void setAd_type (String ad_type)
   {
      this.ad_type = ad_type;
   }

   public String getLink ()
   {
      return link;
   }

   public void setLink (String link)
   {
      this.link = link;
   }

   public String getDescription ()
   {
      return description;
   }

   public void setDescription (String description)
   {
      this.description = description;
   }

   public String getSection ()
{
   return section;
}

   public void setSection (String section)
   {
      this.section = section;
   }

   public String getTitle ()
{
   return title;
}

   public void setTitle (String title)
   {
      this.title = title;
   }

   public String getType ()
   {
      return type;
   }

   public void setType (String type)
   {
      this.type = type;
   }

   public String getPoints ()
{
   return points;
}

   public void setPoints (String points)
   {
      this.points = points;
   }

   public String getScore ()
{
   return score;
}

   public void setScore (String score)
   {
      this.score = score;
   }

   public String getDatetime ()
   {
      return datetime;
   }

   public void setDatetime (String datetime)
   {
      this.datetime = datetime;
   }

   public String getHas_sound ()
   {
      return has_sound;
   }

   public void setHas_sound (String has_sound)
   {
      this.has_sound = has_sound;
   }

   public String getFavorite_count ()
{
   return favorite_count;
}

   public void setFavorite_count (String favorite_count)
   {
      this.favorite_count = favorite_count;
   }

   public String getId ()
   {
      return id;
   }

   public void setId (String id)
   {
      this.id = id;
   }

   public String getIn_gallery ()
   {
      return in_gallery;
   }

   public void setIn_gallery (String in_gallery)
   {
      this.in_gallery = in_gallery;
   }

   public String getVote ()
{
   return vote;
}

   public void setVote (String vote)
   {
      this.vote = vote;
   }

   public String getViews ()
   {
      return views;
   }

   public void setViews (String views)
   {
      this.views = views;
   }

   public String getHeight ()
   {
      return height;
   }

   public void setHeight (String height)
   {
      this.height = height;
   }

   public String getDowns ()
{
   return downs;
}

   public void setDowns (String downs)
   {
      this.downs = downs;
   }

   public String getBandwidth ()
   {
      return bandwidth;
   }

   public void setBandwidth (String bandwidth)
   {
      this.bandwidth = bandwidth;
   }

   public String getNsfw ()
{
   return nsfw;
}

   public void setNsfw (String nsfw)
   {
      this.nsfw = nsfw;
   }

   public String getIs_ad ()
   {
      return is_ad;
   }

   public void setIs_ad (String is_ad)
   {
      this.is_ad = is_ad;
   }

   public String getEdited ()
   {
      return edited;
   }

   public void setEdited (String edited)
   {
      this.edited = edited;
   }

   public String getAd_url ()
   {
      return ad_url;
   }

   public void setAd_url (String ad_url)
   {
      this.ad_url = ad_url;
   }

   public String[] getTags ()
   {
      return tags;
   }

   public void setTags (String[] tags)
   {
      this.tags = tags;
   }

   public String getAccount_id ()
{
   return account_id;
}

   public void setAccount_id (String account_id)
   {
      this.account_id = account_id;
   }

   public String getSize ()
   {
      return size;
   }

   public void setSize (String size)
   {
      this.size = size;
   }

   public String getWidth ()
   {
      return width;
   }

   public void setWidth (String width)
   {
      this.width = width;
   }

   public String getAccount_url ()
{
   return account_url;
}

   public void setAccount_url (String account_url)
   {
      this.account_url = account_url;
   }

   public String getAnimated ()
   {
      return animated;
   }

   public void setAnimated (String animated)
   {
      this.animated = animated;
   }

   public String getUps ()
{
   return ups;
}

   public void setUps (String ups)
   {
      this.ups = ups;
   }

   public String getFavorite ()
   {
      return favorite;
   }

   public void setFavorite (String favorite)
   {
      this.favorite = favorite;
   }

   @Override
   public String toString()
   {
      return "ClassPojo [comment_count = "+comment_count+", in_most_viral = "+in_most_viral+", ad_type = "+ad_type+", link = "+link+", description = "+description+", section = "+section+", title = "+title+", type = "+type+", points = "+points+", score = "+score+", datetime = "+datetime+", has_sound = "+has_sound+", favorite_count = "+favorite_count+", id = "+id+", in_gallery = "+in_gallery+", vote = "+vote+", views = "+views+", height = "+height+", downs = "+downs+", bandwidth = "+bandwidth+", nsfw = "+nsfw+", is_ad = "+is_ad+", edited = "+edited+", ad_url = "+ad_url+", tags = "+tags+", account_id = "+account_id+", size = "+size+", width = "+width+", account_url = "+account_url+", animated = "+animated+", ups = "+ups+", favorite = "+favorite+"]";
   }

public class Tagsx
{
   private String background_hash;

   private String is_promoted;

   private String background_is_animated;

   private String thumbnail_hash;

   private String description;

   private String display_name;

   private String is_whitelisted;

   private String total_items;

   private String accent;

   private String thumbnail_is_animated;

   private String followers;

   private String following;

   private String name;

   private String logo_hash;

   private String description_annotations;

   private String logo_destination_url;

   public String getBackground_hash ()
   {
      return background_hash;
   }

   public void setBackground_hash (String background_hash)
   {
      this.background_hash = background_hash;
   }

   public String getIs_promoted ()
   {
      return is_promoted;
   }

   public void setIs_promoted (String is_promoted)
   {
      this.is_promoted = is_promoted;
   }

   public String getBackground_is_animated ()
   {
      return background_is_animated;
   }

   public void setBackground_is_animated (String background_is_animated)
   {
      this.background_is_animated = background_is_animated;
   }

   public String getThumbnail_hash ()
   {
      return thumbnail_hash;
   }

   public void setThumbnail_hash (String thumbnail_hash)
   {
      this.thumbnail_hash = thumbnail_hash;
   }

   public String getDescription ()
   {
      return description;
   }

   public void setDescription (String description)
   {
      this.description = description;
   }

   public String getDisplay_name ()
   {
      return display_name;
   }

   public void setDisplay_name (String display_name)
   {
      this.display_name = display_name;
   }

   public String getIs_whitelisted ()
   {
      return is_whitelisted;
   }

   public void setIs_whitelisted (String is_whitelisted)
   {
      this.is_whitelisted = is_whitelisted;
   }

   public String getTotal_items ()
   {
      return total_items;
   }

   public void setTotal_items (String total_items)
   {
      this.total_items = total_items;
   }

   public String getAccent ()
   {
      return accent;
   }

   public void setAccent (String accent)
   {
      this.accent = accent;
   }

   public String getThumbnail_is_animated ()
   {
      return thumbnail_is_animated;
   }

   public void setThumbnail_is_animated (String thumbnail_is_animated)
   {
      this.thumbnail_is_animated = thumbnail_is_animated;
   }

   public String getFollowers ()
   {
      return followers;
   }

   public void setFollowers (String followers)
   {
      this.followers = followers;
   }

   public String getFollowing ()
   {
      return following;
   }

   public void setFollowing (String following)
   {
      this.following = following;
   }

   public String getName ()
   {
      return name;
   }

   public void setName (String name)
   {
      this.name = name;
   }

   public String getLogo_hash ()
{
   return logo_hash;
}

   public void setLogo_hash (String logo_hash)
   {
      //this.logo_hash = logo_hash;
   }

   public String getDescription_annotations ()
   {
      return description_annotations;
   }

   public void setDescription_annotations (String description_annotations)
   {
      this.description_annotations = description_annotations;
   }

   public String getLogo_destination_url ()
{
   return logo_destination_url;
}

//   public void setLogo_destination_url (String logo_destination_url)
//   {
//      this.logo_destination_url = logo_destination_url;
//   }

   @Override
   public String toString()
   {
      return "ClassPojo [background_hash = "+background_hash+", is_promoted = "+is_promoted+", background_is_animated = "+background_is_animated+", thumbnail_hash = "+thumbnail_hash+", description = "+description+", display_name = "+display_name+", is_whitelisted = "+is_whitelisted+", total_items = "+total_items+", accent = "+accent+", thumbnail_is_animated = "+thumbnail_is_animated+", followers = "+followers+", following = "+following+", name = "+name+", logo_hash = "+logo_hash+", description_annotations = "+description_annotations+", logo_destination_url = "+logo_destination_url+"]";
   }
}
}
}
}
}
   }
}




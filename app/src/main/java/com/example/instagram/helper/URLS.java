package com.example.instagram.helper;

public class URLS {

    public static final String login_api="https://myinstahome.000webhostapp.com/login.php";
    public static final String sign_up_api="https://myinstahome.000webhostapp.com/sign_up.php";
    public static final String upload_story_image= "https://myinstahome.000webhostapp.com/upload_story_image.php";
    public static final String get_following_ids="https://myinstahome.000webhostapp" +
            ".com/get_following_ids.php";
    public static final String latest_news_feed="https://myinstahome.000webhostapp.com/latest_news_feed.php?following_ids[]=" ;
    public static final String all_stories_we_liked="https://myinstahome.000webhostapp.com/all_stories_we_liked.php?story_ids[]=" ;
    public static final String get_all_comments="https://myinstahome.000webhostapp.com/get_all_comments" +
            ".php?story_ id=";
    public static final String send_comment="https://myinstahome.000webhostapp.com/send_comment.php";
    public static final String check_following_state = "https://myinstahome.000webhostapp" +
            ".com/check_following_state.php?other_user_id=";
    public static final String unfollow_this_person = "https://myinstahome.000webhostapp" +
            ".com/unfollow_this_person.php?other_user_id=";
    public static final String follow_this_person = "https://myinstahome.000webhostapp" +
            ".com/follow_this_person.php?other_user_id=";
    public static final String get_user_data = "https://myinstahome.000webhostapp" +
            ".com/get_user_data.php?user_id=";
    public static final String get_similar_users="https://myinstahome.000webhostapp" +
            ".com/get_similar_users" +
            ".php?text=";
    public static final String update_profile_image="https://myinstahome.000webhostapp" +
            ".com/update_profile_image" +
            ".php";
    public static final String update_user_data="https://myinstahome.000webhostapp" +
            ".com/update_user_data" +
            ".php";
    public static final String increase_likes = "https://myinstahome.000webhostapp" +
            ".com/increase_likes.php?user_id=";
    public static final String decrease_likes = "https://myinstahome.000webhostapp" +
            ".com/decrease_likes.php?user_id=";
    public static final String add_user_to_likes_db  = "https://myinstahome.000webhostapp" +
            ".com/add_user_to_likes_db.php?user_id=";
    public static final String remove_user_from_likes_db  = "https://myinstahome.000webhostapp" +
            ".com/remove_user_from_likes_db.php?user_id=";

    public static final String did_user_like_story = "https://myinstahome.000webhostapp" +
            ".com/did_user_like_story.php?user_id=";

    public static final String get_all_story_ids = "https://myinstahome.000webhostapp" +
            ".com/get_all_story_ids.php?user_id=";
}

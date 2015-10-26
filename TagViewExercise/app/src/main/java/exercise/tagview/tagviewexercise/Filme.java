package exercise.tagview.tagviewexercise;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Felipe on 24/10/2015.
 */
public class Filme {
    private boolean adult;
    private String character;
    @SerializedName("credit_id") private String creditId;
    private int id;
    @SerializedName("original_title") private String originalTitle;
    @SerializedName("poster_path") private String posterPath;
    @SerializedName("release_date") private String releaseDate;
    @SerializedName("title") private String title;}

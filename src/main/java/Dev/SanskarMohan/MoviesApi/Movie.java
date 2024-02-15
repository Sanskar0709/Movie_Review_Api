package Dev.SanskarMohan.MoviesApi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "Movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    private ObjectId Id;
    private String imdbId;
    private String title;
    private List<String> genres;
    private List<String> backdrops;
    @DocumentReference
    private List<Review> reviewIds;
}

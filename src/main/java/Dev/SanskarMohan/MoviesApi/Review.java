package Dev.SanskarMohan.MoviesApi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Review {

    private ObjectId Id;
    private String reviewBody;

    public Review(String reviewBody) {
        this.reviewBody = reviewBody;
    }
}

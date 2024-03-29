package Dev.SanskarMohan.MoviesApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class reviewService {
    @Autowired
    private reviewRepo revrepo;
    @Autowired
    private MongoTemplate mongoTemplate;

    public Review CreateReview(String reviewBody,String imdbId) {
//        Review review = new Review(reviewBody);
//        revrepo.insert(review);
            Review review =revrepo.insert(new Review(reviewBody));

//        mongoTemplate.update(Movie.class).matching(Criteria.where("imdbId").is(imdbId)).apply(new Update().push("reviewIds").value(review)).first();
        mongoTemplate.update(Movie.class)
                .matching(Criteria.where("imdbId").is(imdbId))
                .apply(new Update().push("reviewIds").value(review.getId()))
                .first();
        return review;
    }



}

package Dev.SanskarMohan.MoviesApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/Review")
public class ReviewController {
    @Autowired
    private reviewService reviewservice;
    @PostMapping
    public ResponseEntity<Review> ReviewCreatiion(@RequestBody Map<String ,String> payload){
        return new ResponseEntity<Review>(reviewservice.CreateReview(payload.get("reviewBody"),payload.get("imdbId")), HttpStatus.CREATED);
    }

}

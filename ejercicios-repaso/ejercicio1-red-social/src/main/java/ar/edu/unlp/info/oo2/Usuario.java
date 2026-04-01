package ar.edu.unlp.info.oo2;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
  private String screenName;
  private List<Tweet> tweets;

  public Usuario(String screenName) {
    this.screenName = screenName;
    this.tweets = new ArrayList<>();
  }

  public String getScreenName() {
    return screenName;
  }

  public List<Tweet> getTweets() {
    return tweets;
  }

  public Tweet postearTweet(String texto) {
    Tweet tweet = new TweetOriginal(texto);
    this.tweets.add(tweet);
    return tweet;
  }

  public Tweet retweetear(Tweet tweetOriginal) {
    Tweet reTweet = new ReTweet(tweetOriginal);
    this.tweets.add(reTweet);
    return reTweet;
  }

  public void limpiarTweets(List<Tweet> tweetsAEliminar) {
    this.tweets.removeIf(t -> t.debeBorrarse(tweetsAEliminar));
  }

}

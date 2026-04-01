package ar.edu.unlp.info.oo2;

import java.util.List;

public class ReTweet implements Tweet {
  private Tweet tweetOriginal;

  public ReTweet(Tweet tweetOriginal) {
    this.tweetOriginal = tweetOriginal;
  }

  @Override
  public String getTexto() {
    return tweetOriginal.getTexto();
  }

  @Override
  public boolean debeBorrarse(List<Tweet> tweetsAEliminar) {
    return tweetsAEliminar.contains(tweetOriginal);
  }

}

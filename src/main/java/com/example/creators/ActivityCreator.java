package com.example.creators;

import com.microsoft.bot.schema.models.Activity;
import com.microsoft.bot.schema.models.ActivityTypes;
import com.microsoft.bot.schema.models.Attachment;
import com.example.spellcheckers.JazzySpellChecker;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ActivityCreator {

  private static final String spellCheckedResponsePart = "You have probably mean: ";
  private static final String echoResponsePart = "You typed: ";
  private static JazzySpellChecker spellChecker = new JazzySpellChecker();
  //private JazzySpellChecker spellChecker = new JazzySpellChecker();

  private ActivityCreator() {

  }

  public static Activity createSpellCheckedActivity(Activity activity) {
    return createEmptyActivity(activity)
        .withText(spellCheckedResponsePart + spellChecker.getCorrectedText(activity.text()));
  }

  public static Activity createEchoActivity(Activity activity) {
    return createEmptyActivity(activity)
        .withText(echoResponsePart + activity.text());
  }

  private static Activity createEmptyActivity(Activity activity) {
	  /*Attachment attachment = new Attachment();
	  attachment.withContent("123");
	  List<Attachment> l = new ArrayList<Attachment>();
	  l.add(attachment);*/
    return new Activity()
        .withType(ActivityTypes.MESSAGE)
        .withRecipient(activity.from())
        .withFrom(activity.recipient());
        //.withAttachments(l);
  }
}
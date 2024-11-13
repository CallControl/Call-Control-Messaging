package dev.octoshrimpy.quik.feature.scheduled;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ScheduledMessageAttachmentAdapter_Factory
    implements Factory<ScheduledMessageAttachmentAdapter> {
  private final Provider<Context> contextProvider;

  public ScheduledMessageAttachmentAdapter_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public ScheduledMessageAttachmentAdapter get() {
    return provideInstance(contextProvider);
  }

  public static ScheduledMessageAttachmentAdapter provideInstance(
      Provider<Context> contextProvider) {
    return new ScheduledMessageAttachmentAdapter(contextProvider.get());
  }

  public static ScheduledMessageAttachmentAdapter_Factory create(
      Provider<Context> contextProvider) {
    return new ScheduledMessageAttachmentAdapter_Factory(contextProvider);
  }

  public static ScheduledMessageAttachmentAdapter newScheduledMessageAttachmentAdapter(
      Context context) {
    return new ScheduledMessageAttachmentAdapter(context);
  }
}

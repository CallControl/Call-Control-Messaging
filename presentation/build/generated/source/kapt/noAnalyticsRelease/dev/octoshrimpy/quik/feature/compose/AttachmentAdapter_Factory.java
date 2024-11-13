package dev.octoshrimpy.quik.feature.compose;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AttachmentAdapter_Factory implements Factory<AttachmentAdapter> {
  private final Provider<Context> contextProvider;

  public AttachmentAdapter_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public AttachmentAdapter get() {
    return provideInstance(contextProvider);
  }

  public static AttachmentAdapter provideInstance(Provider<Context> contextProvider) {
    return new AttachmentAdapter(contextProvider.get());
  }

  public static AttachmentAdapter_Factory create(Provider<Context> contextProvider) {
    return new AttachmentAdapter_Factory(contextProvider);
  }

  public static AttachmentAdapter newAttachmentAdapter(Context context) {
    return new AttachmentAdapter(context);
  }
}

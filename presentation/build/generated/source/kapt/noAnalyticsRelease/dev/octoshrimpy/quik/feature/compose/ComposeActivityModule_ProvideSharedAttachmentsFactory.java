package dev.octoshrimpy.quik.feature.compose;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dev.octoshrimpy.quik.model.Attachments;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ComposeActivityModule_ProvideSharedAttachmentsFactory
    implements Factory<Attachments> {
  private final ComposeActivityModule module;

  private final Provider<ComposeActivity> activityProvider;

  public ComposeActivityModule_ProvideSharedAttachmentsFactory(
      ComposeActivityModule module, Provider<ComposeActivity> activityProvider) {
    this.module = module;
    this.activityProvider = activityProvider;
  }

  @Override
  public Attachments get() {
    return provideInstance(module, activityProvider);
  }

  public static Attachments provideInstance(
      ComposeActivityModule module, Provider<ComposeActivity> activityProvider) {
    return proxyProvideSharedAttachments(module, activityProvider.get());
  }

  public static ComposeActivityModule_ProvideSharedAttachmentsFactory create(
      ComposeActivityModule module, Provider<ComposeActivity> activityProvider) {
    return new ComposeActivityModule_ProvideSharedAttachmentsFactory(module, activityProvider);
  }

  public static Attachments proxyProvideSharedAttachments(
      ComposeActivityModule instance, ComposeActivity activity) {
    return Preconditions.checkNotNull(
        instance.provideSharedAttachments(activity),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}

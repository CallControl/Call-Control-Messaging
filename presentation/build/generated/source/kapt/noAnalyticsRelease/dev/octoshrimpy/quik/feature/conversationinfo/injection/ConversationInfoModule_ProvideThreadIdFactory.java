package dev.octoshrimpy.quik.feature.conversationinfo.injection;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ConversationInfoModule_ProvideThreadIdFactory implements Factory<Long> {
  private final ConversationInfoModule module;

  public ConversationInfoModule_ProvideThreadIdFactory(ConversationInfoModule module) {
    this.module = module;
  }

  @Override
  public Long get() {
    return provideInstance(module);
  }

  public static Long provideInstance(ConversationInfoModule module) {
    return proxyProvideThreadId(module);
  }

  public static ConversationInfoModule_ProvideThreadIdFactory create(
      ConversationInfoModule module) {
    return new ConversationInfoModule_ProvideThreadIdFactory(module);
  }

  public static long proxyProvideThreadId(ConversationInfoModule instance) {
    return instance.provideThreadId();
  }
}

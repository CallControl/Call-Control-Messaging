package dev.octoshrimpy.quik.common.util;

import dagger.internal.Factory;
import dev.octoshrimpy.quik.util.Preferences;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FileLoggingTree_Factory implements Factory<FileLoggingTree> {
  private final Provider<Preferences> prefsProvider;

  public FileLoggingTree_Factory(Provider<Preferences> prefsProvider) {
    this.prefsProvider = prefsProvider;
  }

  @Override
  public FileLoggingTree get() {
    return provideInstance(prefsProvider);
  }

  public static FileLoggingTree provideInstance(Provider<Preferences> prefsProvider) {
    return new FileLoggingTree(prefsProvider.get());
  }

  public static FileLoggingTree_Factory create(Provider<Preferences> prefsProvider) {
    return new FileLoggingTree_Factory(prefsProvider);
  }

  public static FileLoggingTree newFileLoggingTree(Preferences prefs) {
    return new FileLoggingTree(prefs);
  }
}

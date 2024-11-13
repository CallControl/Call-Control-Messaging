package dev.octoshrimpy.quik.feature.compose.editing;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ChipsAdapter_Factory implements Factory<ChipsAdapter> {
  private static final ChipsAdapter_Factory INSTANCE = new ChipsAdapter_Factory();

  @Override
  public ChipsAdapter get() {
    return provideInstance();
  }

  public static ChipsAdapter provideInstance() {
    return new ChipsAdapter();
  }

  public static ChipsAdapter_Factory create() {
    return INSTANCE;
  }

  public static ChipsAdapter newChipsAdapter() {
    return new ChipsAdapter();
  }
}

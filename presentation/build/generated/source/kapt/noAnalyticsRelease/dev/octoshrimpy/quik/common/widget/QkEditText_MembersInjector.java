package dev.octoshrimpy.quik.common.widget;

import dagger.MembersInjector;
import dev.octoshrimpy.quik.common.util.TextViewStyler;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class QkEditText_MembersInjector implements MembersInjector<QkEditText> {
  private final Provider<TextViewStyler> textViewStylerProvider;

  public QkEditText_MembersInjector(Provider<TextViewStyler> textViewStylerProvider) {
    this.textViewStylerProvider = textViewStylerProvider;
  }

  public static MembersInjector<QkEditText> create(
      Provider<TextViewStyler> textViewStylerProvider) {
    return new QkEditText_MembersInjector(textViewStylerProvider);
  }

  @Override
  public void injectMembers(QkEditText instance) {
    injectTextViewStyler(instance, textViewStylerProvider.get());
  }

  public static void injectTextViewStyler(QkEditText instance, TextViewStyler textViewStyler) {
    instance.textViewStyler = textViewStyler;
  }
}

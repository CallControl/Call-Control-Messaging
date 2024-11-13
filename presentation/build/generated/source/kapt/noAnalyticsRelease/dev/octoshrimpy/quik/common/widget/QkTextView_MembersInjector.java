package dev.octoshrimpy.quik.common.widget;

import dagger.MembersInjector;
import dev.octoshrimpy.quik.common.util.TextViewStyler;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class QkTextView_MembersInjector implements MembersInjector<QkTextView> {
  private final Provider<TextViewStyler> textViewStylerProvider;

  public QkTextView_MembersInjector(Provider<TextViewStyler> textViewStylerProvider) {
    this.textViewStylerProvider = textViewStylerProvider;
  }

  public static MembersInjector<QkTextView> create(
      Provider<TextViewStyler> textViewStylerProvider) {
    return new QkTextView_MembersInjector(textViewStylerProvider);
  }

  @Override
  public void injectMembers(QkTextView instance) {
    injectTextViewStyler(instance, textViewStylerProvider.get());
  }

  public static void injectTextViewStyler(QkTextView instance, TextViewStyler textViewStyler) {
    instance.textViewStyler = textViewStyler;
  }
}

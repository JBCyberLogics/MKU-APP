package ke.ac.mku.authcore.manager;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class SnapshotManager_Factory implements Factory<SnapshotManager> {
  @Override
  public SnapshotManager get() {
    return newInstance();
  }

  public static SnapshotManager_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static SnapshotManager newInstance() {
    return new SnapshotManager();
  }

  private static final class InstanceHolder {
    static final SnapshotManager_Factory INSTANCE = new SnapshotManager_Factory();
  }
}

// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package roomdemo.wiseass.com.roomdemo.dependencyinjection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import roomdemo.wiseass.com.roomdemo.data.ListItemDao;
import roomdemo.wiseass.com.roomdemo.data.ListItemDatabase;

public final class RoomModule_ProvideListItemDaoFactory implements Factory<ListItemDao> {
  private final RoomModule module;

  private final Provider<ListItemDatabase> databaseProvider;

  public RoomModule_ProvideListItemDaoFactory(
      RoomModule module, Provider<ListItemDatabase> databaseProvider) {
    this.module = module;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public ListItemDao get() {
    return Preconditions.checkNotNull(
        module.provideListItemDao(databaseProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ListItemDao> create(
      RoomModule module, Provider<ListItemDatabase> databaseProvider) {
    return new RoomModule_ProvideListItemDaoFactory(module, databaseProvider);
  }

  public static ListItemDao proxyProvideListItemDao(
      RoomModule instance, ListItemDatabase database) {
    return instance.provideListItemDao(database);
  }
}

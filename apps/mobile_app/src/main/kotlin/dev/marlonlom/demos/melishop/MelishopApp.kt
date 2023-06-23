package dev.marlonlom.demos.melishop

import android.app.Application
import timber.log.Timber

/**
 * Melishop application class.
 *
 * @author marlonlom
 */
class MelishopApp : Application() {

  override fun onCreate() {
    super.onCreate()
    setupTimber()
  }

  private fun setupTimber() {
    //if (BuildConfig.DEBUG) {
    Timber.plant(Timber.DebugTree())
    //}
  }
}

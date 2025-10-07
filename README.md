# Optimize Mod (Forge 1.12.2)

This project repackages the legacy Optimize client as a Forge 1.12.2 mod. The
original binary classes live under `src/main/resources/optimize/optimizemod` and
are bundled directly into the output jar. Two small Java sources are provided:

* `OptimizeModForge` – the Forge entrypoint.
* `SystemUtil` – a clean-room replacement for the old HWID gate that now returns
  a constant identifier, effectively removing the login lock while keeping the
  rest of the client stable.

To build the mod you can use Gradle (ForgeGradle 2.3 compatible). The project is
configured for Gradle **6.8.1**, which still exposes the legacy `compile`/
`runtime` configurations required by ForgeGradle 2.3. Running `gradle wrapper
--gradle-version 6.8.1 --distribution-type all` in the project directory will
generate the wrapper so `./gradlew build` produces a jar containing the legacy
classes alongside the new entrypoints.

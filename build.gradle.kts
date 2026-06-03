plugins {
  id("me.roundaround.allay")
}

allay {
  displayName.set("Named Traders")
  description.set("Naming wandering traders or their llamas prevents them from despawning.")
  authors.set(listOf("Roundaround"))
  license.set("MIT")
  homepage.set("https://modrinth.com/mod/named-traders")
  repository.set("https://github.com/Roundaround/mc-fabric-named-traders")
  issues.set("https://github.com/Roundaround/mc-fabric-named-traders/issues")
  logoFile.set("assets/namedtraders/icon.png")

  modrinth {
    projectId.set("named-traders")
  }

  release {
    versionType.set("release")
    sourcesJar.set(true)
  }
}

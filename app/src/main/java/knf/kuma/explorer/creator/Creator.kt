package knf.kuma.explorer.creator

import knf.kuma.pojos.ExplorerObject

interface Creator {
    fun exist(): Boolean
    fun createLinksList(): List<String>
    fun createDirectoryList(progressCallback: (Int, Int) -> Unit): List<ExplorerObject>
}
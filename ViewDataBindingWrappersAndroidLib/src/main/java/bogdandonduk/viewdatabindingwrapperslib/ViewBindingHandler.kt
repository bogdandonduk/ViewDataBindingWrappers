package bogdandonduk.viewdatabindingwrapperslib

import androidx.viewbinding.ViewBinding

interface ViewBindingHandler<T : ViewBinding> {
    /**
     * Mark the 'viewBinding' property of as 'lateinit'
     */
    var viewBinding: T
}
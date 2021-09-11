package bogdandonduk.viewdatabindingwrapperslib

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

open class BaseViewBindingHandlerBottomSheetDialogFragment<ViewBindingType : ViewBinding>(
    open var viewBindingInflation: (layoutInflater: LayoutInflater, parent: ViewGroup?) -> ViewBindingType
): BottomSheetDialogFragment(), ViewBindingHandler<ViewBindingType> {
    override lateinit var viewBinding: ViewBindingType

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = viewBindingInflation.invoke(layoutInflater, container)

        return viewBinding.root
    }
}